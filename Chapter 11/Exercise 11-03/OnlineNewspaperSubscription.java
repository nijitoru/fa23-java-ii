public class OnlineNewspaperSubscription extends NewspaperSubscription
{
    public void setAddress(String a)
    {
        if(a.contains("@")){
            this.address = a;
            this.rate = 9;
        } else {
            this.address = a;
            this.rate = 0;
        }
    }
}

