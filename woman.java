class Woman extends Human{

    private int beauty;
    private int intelligence;
    private String hairColor;
    private int talking;
    private int happiness;
    private String name;
    private int weight;
    protected int age;
    public static askCount;
    
    Woman(){
        this.beauty       = super.getBeauty();
        this.intelligence = super.getIntelligence();
        this.hairColor    = super.getHairColor();
        this.talking      = super.getTalkingLevel();
        this.happiness    = super.getHappiness();
        this.weight       = super.getWeight();
        this.name         = super.getName();
        this.age          = super.getAge();
        if(this.hairColor=='yellow'){
            this.intelligence = this.intelligence/2;
        }
    }
    
    public void isUseGlasses(){
        if(super.glassesControl()){
            this.intelligence = this.intelligence + 1;
            return true;
        }else{
            return false;
        }
    }
    
    public void guessHerAge(int yourGuess){
        if(yourGuess>this.age){
            super.finishHim();
        }else if(yourGuess<this.age){
            return true;
        }
    }
    
    public void talk(){
        while(IsAlive()) talk();
    }
    
    public void shopping(){
        while(haveMoney()) shopping(); 
    }
    
    public void isKnowOffSide(){
        Random rand = new Random();    
        int rate = rand.nextInt(11);
        if(rate<1){
            return true;
        }else{
            return false;
        }
    }
    
    public void getHerName(){
         if(this.isUseGlasses() || beauty<6){
            return this.name;
         }else{
            if(this.happiness>7){
                getHerName();
            }else{
                System.out.println("Run away for save your life");
            }
         }
    }
    
    public void getRelationshipStatus(int weight,int beauty,int age,int intelligence){
        int goldenValue = weight*(-2)+beauty+(intelligence/2)-age;
        if(goldenValue>50) return true;
        else return false;
    }
    
    public void isHappy(){
        this.askCount++;
        if(this.askCount>3) super.finishHim();
        else return false;
    }
    
    public void setHappiness(int likedPhotoCount){
        for(int i=0;i<=photoCount;i++) this.happiness++;
    }
    
    public void takePicture(){
        while(phoneStorageIsEmpty()) super.shot();
        else{
            super.sharePhotos();
            super.emptyPhoneStorage();
            takePicture();
        }
    }
    
    public void cry(){
        if(anyoneDoingNow()) return true;
    }
    
}