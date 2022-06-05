/**
 * @author Yu
 * @title: ConcreateBuilder
 * @projectName BP
 * @date 2022/5/26 17:38
 */
public class ConcreateBuilder extends HomeworkBuilder {
    private Homework homework;

    public ConcreateBuilder(Homework homework) {
        this.homework = homework;
    }

    @Override
    public HomeworkBuilder buildEasyQc(String easyQc) {
        homework.setEasyQc(easyQc);
        return this;
    }

    @Override
    public HomeworkBuilder buildNormalQc(String normalQc) {
        homework.setNormalQc(normalQc);
        return this;
    }

    @Override
    public HomeworkBuilder buildMediumQc(String mediumQc) {
        homework.setMediumQc(mediumQc);
        return this;
    }

    @Override
    public HomeworkBuilder buildHardQc(String hardQc) {
        homework.setHardQc(hardQc);
        return this;
    }

    @Override
    public Homework build() {
        return homework;
    }
}
