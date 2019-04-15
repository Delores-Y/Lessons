package Enum;

public enum Day {

    // 自定义属性
    MONDAY(1, "星期一", "星期一各种不在状态"),
    TUESDAY(2, "星期二", "星期二依旧犯困"),
    WEDNESDAY(3, "星期三", "星期三感觉半周终于过去了"),
    THURSDAY(4, "星期四", "星期四期待这星期五"),
    FRIDAY(5, "星期五", "星期五感觉还不错"),
    SATURDAY(6, "星期六", "星期六感觉非常好"),
    SUNDAY(7, "星期日", "星期日感觉周末还没过够。。。");

    Day(int index, String name, String value) {
        this.index = index;
        this.name = name;
        this.value = value;
    }

    private int index;
    private String name;
    private String value;

    @Override
    public String toString() {
        return this.index + "_" + this.name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
