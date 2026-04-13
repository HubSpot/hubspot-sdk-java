// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.errors.HubSpotInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PublicListConversionTimeTest {

    @Test
    fun ofDate() {
        val date =
            PublicListConversionDate.builder()
                .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                .day(0)
                .month(0)
                .year(0)
                .build()

        val publicListConversionTime = PublicListConversionTime.ofDate(date)

        assertThat(publicListConversionTime.date()).contains(date)
        assertThat(publicListConversionTime.inactivity()).isEmpty
    }

    @Test
    fun ofDateRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicListConversionTime =
            PublicListConversionTime.ofDate(
                PublicListConversionDate.builder()
                    .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                    .day(0)
                    .month(0)
                    .year(0)
                    .build()
            )

        val roundtrippedPublicListConversionTime =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicListConversionTime),
                jacksonTypeRef<PublicListConversionTime>(),
            )

        assertThat(roundtrippedPublicListConversionTime).isEqualTo(publicListConversionTime)
    }

    @Test
    fun ofInactivity() {
        val inactivity =
            PublicListConversionInactivity.builder()
                .conversionType(PublicListConversionInactivity.ConversionType.INACTIVITY)
                .offset(0)
                .timeUnit(PublicListConversionInactivity.TimeUnit.DAY)
                .build()

        val publicListConversionTime = PublicListConversionTime.ofInactivity(inactivity)

        assertThat(publicListConversionTime.date()).isEmpty
        assertThat(publicListConversionTime.inactivity()).contains(inactivity)
    }

    @Test
    fun ofInactivityRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicListConversionTime =
            PublicListConversionTime.ofInactivity(
                PublicListConversionInactivity.builder()
                    .conversionType(PublicListConversionInactivity.ConversionType.INACTIVITY)
                    .offset(0)
                    .timeUnit(PublicListConversionInactivity.TimeUnit.DAY)
                    .build()
            )

        val roundtrippedPublicListConversionTime =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicListConversionTime),
                jacksonTypeRef<PublicListConversionTime>(),
            )

        assertThat(roundtrippedPublicListConversionTime).isEqualTo(publicListConversionTime)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val publicListConversionTime =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PublicListConversionTime>())

        val e = assertThrows<HubSpotInvalidDataException> { publicListConversionTime.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
