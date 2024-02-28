public class Ring {
    Fighter boksor1;
    Fighter boksor2;
    int minWeight;
    int maxWeight;

    public Ring( Fighter boksor1, Fighter boksor2, int maxWeight, int minWeight ) {
        this.boksor1 = boksor1;
        this.boksor2 = boksor2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            while (boksor1.getHealtyh() > 0 && boksor2.getHealtyh() > 0) {
                System.out.println("======== YENİ ROUND ===========");
                boksor2.setHealtyh(boksor1.hit(boksor2));
                if (isWin()) {
                    break;
                }
                boksor1.setHealtyh(boksor2.hit(boksor1));
                if (isWin()) {
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {
        return (boksor1.getWight() >= minWeight && boksor1.getWight() <= maxWeight) && (boksor2.getWight() >= minWeight && boksor2.getWight() <= maxWeight);
    }

    public boolean isWin() {
        if (boksor1.getHealtyh() == 0) {
            System.out.println("Maçı Kazanan : " + boksor1.getName());
            return true;
        } else if (boksor2.getHealtyh() == 0) {
            System.out.println("Maçı Kazanan : " + boksor2.getHealtyh());
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(boksor1.getName() + " Kalan Can :" + boksor1.getHealtyh());
        System.out.println(boksor2.getName() + " Kalan Can :" + boksor2.getHealtyh());
    }
}
