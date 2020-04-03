public class Main {
    public static void main(String[] args) {
        SmoothiesBuilderPattern freshSmoothie = SmoothiesBuilderPattern
                .SmoothiesBuilderPatternBuilder
                .aSmoothiesBuilderPattern("Fresh", 330)
                .build();

        SmoothiesBuilderPattern sweetSmoothie = SmoothiesBuilderPattern
                .SmoothiesBuilderPatternBuilder
                .aSmoothiesBuilderPattern("Sweet", 750)
                .withAdditionalIngredients(new String[]{"strawberry", "raspberry", "banana"})
                .build();

        SmoothiesBuilderPattern lactoseFreeSmoothie = SmoothiesBuilderPattern
                .SmoothiesBuilderPatternBuilder
                .aSmoothiesBuilderPattern("LactoseFree", 330)
                .withBase(Base.lACTOSE_FREE_MILK)
                .build();


        SmoothiesBuilderPattern[] smoothies = new SmoothiesBuilderPattern[]{
                freshSmoothie,
                sweetSmoothie,
                lactoseFreeSmoothie};

        for(SmoothiesBuilderPattern smoothie : smoothies){
            System.out.println(smoothie);
        }
    }
}
