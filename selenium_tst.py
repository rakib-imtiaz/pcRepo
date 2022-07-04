from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# driver = webdriver.Chrome(executable_path="/usr/bin/chromedriver")
driver = webdriver.Chrome()

i = 0
for i in range(5):

    driver.get("https://v2.gcchmc.org/book-appointment/")

    firtsName = driver.find_element(By.ID, "id_first_name")
    firtsName.send_keys("Noman")
    lastname = driver.find_element(By.ID, "id_last_name")
    lastname.send_keys("Ansary")

    country = driver.find_element(By.ID, "id_country")
    country.send_keys("BD")

    city = driver.find_element(By.ID, "id_city")
    city.send_keys("Dhaka")

    traveled_country = driver.find_element(By.ID, "id_traveled_country")
    traveled_country.send_keys("BH")

    dateOfBirth = driver.find_element(By.ID, "id_dob")
    dateOfBirth.send_keys("21/12/1997")

    gender = driver.find_element(By.ID, "id_gender_0")
    gender.click()

    maritialSatus = driver.find_element(By.ID, "id_marital_status_0")
    maritialSatus.click()

    passportNo = driver.find_element(By.ID, "id_passport")
    passportNo.send_keys("EBCH2232CD")

    ConfirmpassportNo = driver.find_element(By.ID, "id_confirm_passport")
    ConfirmpassportNo.send_keys("EBCH2232CD")

    id_passport_issue_date = driver.find_element(
        By.ID, "id_passport_issue_date")
    id_passport_issue_date.send_keys("12/12/2009")

    id_passport_issue_place = driver.find_element(
        By.ID, "id_passport_issue_place")
    id_passport_issue_place.send_keys("12/06/2012")

    id_passport_expiry_on = driver.find_element(By.ID, "id_passport_expiry_on")
    id_passport_expiry_on.send_keys("23/06/2030")

    id_visa_type = driver.find_element(By.ID, "id_visa_type")
    id_visa_type.send_keys("wv")

    id_email = driver.find_element(By.ID, "id_email")
    id_email.send_keys("anonymous21120@gmail.com")

    id_phone = driver.find_element(By.ID, "id_phone")
    id_phone.send_keys("+8801712345678")

    id_applied_position = driver.find_element(By.ID, "id_applied_position")
    id_applied_position.send_keys("20")

    id_applied_position_is_other = driver.find_element(
        By.ID, "id_applied_position_is_other")
    id_applied_position_is_other.click()

    id_applied_position_other = driver.find_element(
        By.ID, "id_applied_position_other")
    id_applied_position_other.send_keys("FreeLancer")

    id_confirm = driver.find_element(By.ID, "id_confirm")

    driver.execute_script("$(arguments[0]).click();", id_confirm)
    driver.switch_to.new_window('tab')

    
    
    # id_confirm.click()

    # submit=driver.find_element(By.XPATH,"/html/body/main/div/div[2]/div[2]/div/form/div[2]/button")
    # submit.click()

   # capthca=driver.find_element(By.XPATH,"/html/body/main/div/div[2]/div[2]/div/form/div[1]/div[14]/div/div/div/img")

    # capthca.save("screenshot.png")
