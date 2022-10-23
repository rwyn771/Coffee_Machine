class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        this.minutes += 1;
        this.minutes %= 60;

        if (this.minutes == 0)
        {
            this.hours += 1;
            this.hours %= 12;

            if (this.hours == 0)
            {
                this.hours = 12;
            }
        }
    }
}