package demo06;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("艾希");
        //匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("啪~啪~啪");
            }
        };
        //实现子类
        hero.setSkill(new SkillImpl());
       // hero.setSkill(skill);

        //进一步简化
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~pia~Biu~Pia");
            }
        });
        hero.attack();
    }
}
