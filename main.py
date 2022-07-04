import pyautogui as magic
# #scree size
# print(magic.size())

# # mouse current position
# print(magic.position())
# #move mouse pointer to direction
# magic.moveTo(1200,100)
# # overloaded version of the moveTO, which will have a time delay at the end move mouse pointer to direction
# magic.moveTo(1200,100,3)
# # move relative to the current position of the mouse positon
# magic.moveRel(1200,100,3)


# #click the mouse
# magic.click(1000,1000,2,3,button="right")#(x,y,how many,duration,which button)
# magic.tripleClick(1000,1000,2,3,button="right")


#scrolls up
#magic.scroll(500)
#scrolls down
#magic.scroll(-500)




x,y=magic.locateCenterOnScreen("submit.png")

print(x,y)







