package kadai_015;


    class CarExec_Chapter15 {
        private int gear = 1;
        private int speed = 10;
//        
//        public CarExec_Chapter15(int gear,int speed) {
//        	this.gear = gear;
//        	this.speed = speed;
//        }

        

        public void gearChange(int afterGear) {
        	System.out.println("ギア"+ this.gear +"から" + afterGear + "に切り替えました");
        	this.gear = afterGear; 
        	this.speed = 10;
            switch (gear) {
                case 1, 2, 3, 4, 5 ->  this.speed = speed * gear ;
                default -> this.speed = 10;
            }
        }
            public void run() {
//              this.gear = gear;
//              this.speed = speed;
//              gearChange();
          System.out.println("速度は時速"+ speed +"km" +"です"  );

        }
    }