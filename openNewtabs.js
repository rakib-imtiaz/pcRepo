function newtab(driverObject) 
{
    var numOfTabs=Math.random().toString;
    window.open('https://v2.gcchmc.org/book-appointment/',numOfTabs);

    driverObject.switch_to.window(numOfTabs);

}

newtab(driver)