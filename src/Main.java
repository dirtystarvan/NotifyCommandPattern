import commands.Command;
import commands.EmailNotify;
import commands.SmsNotify;
import receivers.CustomerEmail;
import receivers.CustomerMobilePhone;
import receivers.Receiver;
import senders.BroadcastSender;
import senders.EmailSender;
import senders.SmsSender;

import java.util.Arrays;

public class Main {
	/*
	* Необходимо реализовать сервис отправки уведомлений клиенту для ознакомления с анкетой (например, pdf файл) по кредиту. Существует 3 режима уведомления:
	1.	По sms – клиент получает sms сообщение, которое содержит ссылку для скачивания анкеты;
	2.	По email – клиент получает email сообщение c анкетой, а также sms сообщение с оповещением, что пришел email;
	3.	По sms и email – данный режим включает 1 и 2 режим
	*
	*/

	public static void main(String[] args) {
		Receiver phone = new CustomerMobilePhone();
		Receiver emailAgent = new CustomerEmail();

		Command sendSms = new SmsNotify(phone, "Загрузите анкету по ссылке https://downloadForm.com");
		Command sendEmail = new EmailNotify(emailAgent, "Ваша анкета во вложении.");

		new SmsSender(sendSms).sendNotification();
		new EmailSender(sendEmail).sendNotification();
		new BroadcastSender(Arrays.asList(sendSms, sendEmail)).sendBroadcast();
	}
}
