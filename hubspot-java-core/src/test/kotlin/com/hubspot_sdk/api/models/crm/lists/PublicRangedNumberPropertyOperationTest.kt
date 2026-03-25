// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRangedNumberPropertyOperationTest {

    @Test
    fun create() {
        val publicRangedNumberPropertyOperation =
            PublicRangedNumberPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBound(0)
                .operationType(PublicRangedNumberPropertyOperation.OperationType.NUMBER_RANGED)
                .operator("operator")
                .upperBound(0)
                .build()

        assertThat(publicRangedNumberPropertyOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(publicRangedNumberPropertyOperation.lowerBound()).isEqualTo(0)
        assertThat(publicRangedNumberPropertyOperation.operationType())
            .isEqualTo(PublicRangedNumberPropertyOperation.OperationType.NUMBER_RANGED)
        assertThat(publicRangedNumberPropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicRangedNumberPropertyOperation.upperBound()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRangedNumberPropertyOperation =
            PublicRangedNumberPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBound(0)
                .operationType(PublicRangedNumberPropertyOperation.OperationType.NUMBER_RANGED)
                .operator("operator")
                .upperBound(0)
                .build()

        val roundtrippedPublicRangedNumberPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRangedNumberPropertyOperation),
                jacksonTypeRef<PublicRangedNumberPropertyOperation>(),
            )

        assertThat(roundtrippedPublicRangedNumberPropertyOperation)
            .isEqualTo(publicRangedNumberPropertyOperation)
    }
}
