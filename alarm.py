import time

def set_alarm():
    alarm_time = input("Enter the time for the alarm in HH:MM format: ")
    current_time = time.strftime("%H:%M")

    while current_time != alarm_time:
        current_time = time.strftime("%H:%M")
        time.sleep(1)

    print("Time to wake up! Alarm activated!")

set_alarm()
