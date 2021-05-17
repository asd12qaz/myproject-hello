package com.clay.carTest;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class carclass {
    LocalDateTime Localnow;
    LocalDateTime Localleave;
    private int ID;
    private int time;
    private int costtime;
    private int cost;

    public carclass(int ID, LocalDateTime localnow) {
        this.ID = ID;
        this.Localnow = localnow;
    }

    public void Leave(LocalDateTime localleave) {
        if (localleave.isAfter(this.Localnow)) {
            this.Localleave = localleave;
            this.time();
            this.cost();
            this.print();
        } else {
            System.out.println("系統錯誤 請聯繫管理員 造成不便請見諒");
        }

    }

    private void time() {
        this.time = (int)Duration.between(this.Localnow, this.Localleave).toMinutes();
        this.costtime = (int)Math.ceil((double)this.time / 60.0D);
    }

    private void cost() {
        if (this.costtime >= 5) {
            this.cost = this.costtime * 50;
        } else {
            this.cost = this.costtime * 60;
        }

    }

    private void print() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("車牌:" + this.ID + "\t停車時間共:" + this.time + "分鐘");
        System.out.println("進場時間:" + formatter.format(this.Localnow));
        System.out.println("退場時間:" + formatter.format(this.Localleave));
        System.out.println("系統計算時間:" + this.costtime + "小時\t費用:" + this.cost + "元");
    }

}
