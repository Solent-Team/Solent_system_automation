
@TC-1
Scenario:  Verify whether an admin can able to login to the system
	Prerequisites:
		Should have login credential
	Steps:
		Navigate to the URL (127.0.0.1:3000)
		Click on the Login button
		Enter the Email (admin@mail.com)
		Enter the password (admin@mail.com)
		Click On the Login button

	Expected Results:
		User should able to log in and redirect to the admin dashboard


@TC-2
Scenario: Verify whether contact page is loading as expected
	Steps:
		Navigate to the URL (127.0.0.1:3000)
		Scroll down upto the footer
		Click on the Contact-us link

	Expected Results:
		Contact page should load as expected

@TC-3
Scenario: Verify whether faq page is loading as expected
	Steps:
		Navigate to the URL (127.0.0.1:3000)
		Scroll down upto the footer
		Click on the FAQ link

	Expected Results:
		FAQ page should load as expected

@TC-4
Scenario: Verify whether Howtopurchase page is loading as expected
	Steps:
		Navigate to the URL (127.0.0.1:3000)
		Scroll down upto the footer
		Click on the Howtopurchase link

	Expected Results:
		Howtopurchase page should load as expected


@TC-5
Scenario: Verify whether Privacypolicy page is loading as expected
	Steps:
		Navigate to the URL (127.0.0.1:3000)
		Scroll down upto the footer
		Click on the Privacypolicy link

	Expected Results:
		Privacypolicy page should load as expected


@TC-6
Scenario: Verify whether Refundpolicy page is loading as expected
	Steps:
		Navigate to the URL (127.0.0.1:3000)
		Scroll down upto the footer
		Click on the Refundpolicy link

	Expected Results:
		Refundpolicy page should load as expected




