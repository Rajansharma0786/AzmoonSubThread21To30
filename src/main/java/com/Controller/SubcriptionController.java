package com.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.Entity.TblSubscription;
import com.Repository.TblBillingRepo;
import com.Repository.TblSubscriptionRepository;
import com.Service.SubscriptionService;

//@RestController
@Component
public class SubcriptionController {

	@Autowired
	TblSubscriptionRepository subscriptionRepository;

	@Autowired
	SubscriptionService service;

	@Autowired
	TblBillingRepo billingRepo;

	private final String hour="4";
	private final String hour1="11";
	private final String hour2="17";
	
	
	@Scheduled(cron = "0 5 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 5 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 5 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread21() {

			try {
				String status="21";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	
	@Scheduled(cron = "0 6 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 6 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 6 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread22() {

			try {
				String status="22";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	
	@Scheduled(cron = "0 7 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 7 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 7 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread23() {

			try {
				String status="23";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	
	@Scheduled(cron = "0 8 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 8 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 8 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread24() {

			try {
				String status="24";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	
	@Scheduled(cron = "0 9 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 9 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 9 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread25() {

			try {
				String status="25";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	
	@Scheduled(cron = "0 10 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 10 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 10 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread26() {

			try {
				String status="26";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 11 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 11 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 11 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread27() {

			try {
				String status="27";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 12 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 12 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 12 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread28() {

			try {
				String status="28";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 13 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 13 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 13 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread29() {

			try {
				String status="29";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 14 "+hour+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 14 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 14 "+hour2+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread30() {

			try {
				String status="30";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
}
