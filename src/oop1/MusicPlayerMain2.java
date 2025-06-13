package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusciPlayerData data = new MusciPlayerData();
        
        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumnUp(data);
        // 볼륨 증가
        volumnUp(data);

        // 볼륨 감소
        volumnDown(data);

        // 음악 플레이어 상태
        playerStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusciPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어 시작");
    }

    static void off(MusciPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    static void volumnUp(MusciPlayerData data) {
        data.volumn++;
        System.out.println("음악 플레이어 볼륨 : " + data.volumn);
    }

    static void volumnDown(MusciPlayerData data) {
        data.volumn--;
        System.out.println("음악 플레이어 볼륨 : " + data.volumn);
    }

    static void playerStatus(MusciPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volumn);
        } else {
            off(data);
        }
    }
}
