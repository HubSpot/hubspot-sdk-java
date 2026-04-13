// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRangedDatePropertyOperationTest {

    @Test
    fun create() {
        val publicRangedDatePropertyOperation =
            PublicRangedDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBound(0)
                .operationType(PublicRangedDatePropertyOperation.OperationType.RANGED_DATE)
                .operator("operator")
                .requiresTimeZoneConversion(true)
                .upperBound(0)
                .build()

        assertThat(publicRangedDatePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(publicRangedDatePropertyOperation.lowerBound()).isEqualTo(0)
        assertThat(publicRangedDatePropertyOperation.operationType())
            .isEqualTo(PublicRangedDatePropertyOperation.OperationType.RANGED_DATE)
        assertThat(publicRangedDatePropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicRangedDatePropertyOperation.requiresTimeZoneConversion()).isEqualTo(true)
        assertThat(publicRangedDatePropertyOperation.upperBound()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRangedDatePropertyOperation =
            PublicRangedDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBound(0)
                .operationType(PublicRangedDatePropertyOperation.OperationType.RANGED_DATE)
                .operator("operator")
                .requiresTimeZoneConversion(true)
                .upperBound(0)
                .build()

        val roundtrippedPublicRangedDatePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRangedDatePropertyOperation),
                jacksonTypeRef<PublicRangedDatePropertyOperation>(),
            )

        assertThat(roundtrippedPublicRangedDatePropertyOperation)
            .isEqualTo(publicRangedDatePropertyOperation)
    }
}
