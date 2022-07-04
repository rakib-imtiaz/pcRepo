import random
from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By
import urllib

import pytesseract
import requests
from PIL import Image, ImageFilter
from io import StringIO

# driver = webdriver.Chrome(executable_path="/usr/bin/chromedriver")

driver = webdriver.Chrome()
driver.get("https://v2.gcchmc.org/book-appointment/")

for i in range(20):
    capthca = driver.find_element(
        By.XPATH, "/html/body/main/div/div[2]/div[2]/div/form/div[1]/div[14]/div/div/div/img")
    imageSourceURL = capthca.get_attribute("src")
    driver.get(imageSourceURL)
    print("captcha_", random.randint(1, 100), ".png")
    captchaImage = driver.save_screenshot(
        "captcha_"+str(random.randint(1, 100))+".png")
    Image.filter(ImageFilter.SHARPEN)
    print(pytesseract.image_to_string(captchaImage))
    sleep(3)
    driver.refresh()

