package io.huiseong.depressionDial.backend.application.domain.enums

typealias MentalHealthTestTypeCode = Int

enum class MentalHealthTestType(override val value: MentalHealthTestTypeCode) : ValuedEnum<MentalHealthTestTypeCode> {
    DEPRESSION_TEST(0),
    ANXIETY_TEST(1),
    ANGER_TEST(2),
    RELATIONSHIP_TEST(3),
    TEMPTATION_TEST(4),
    HAPPINESS_TEST(5),
}