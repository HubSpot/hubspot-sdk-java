// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicComparativeDatePropertyOperationTest {

    @Test
    fun create() {
        val publicComparativeDatePropertyOperation =
            PublicComparativeDatePropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType(
                    PublicComparativeDatePropertyOperation.OperationType.COMPARATIVE_DATE
                )
                .operator("operator")
                .defaultComparisonValue("defaultComparisonValue")
                .build()

        assertThat(publicComparativeDatePropertyOperation.comparisonPropertyName())
            .isEqualTo("comparisonPropertyName")
        assertThat(publicComparativeDatePropertyOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(publicComparativeDatePropertyOperation.operationType())
            .isEqualTo(PublicComparativeDatePropertyOperation.OperationType.COMPARATIVE_DATE)
        assertThat(publicComparativeDatePropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicComparativeDatePropertyOperation.defaultComparisonValue())
            .contains("defaultComparisonValue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicComparativeDatePropertyOperation =
            PublicComparativeDatePropertyOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType(
                    PublicComparativeDatePropertyOperation.OperationType.COMPARATIVE_DATE
                )
                .operator("operator")
                .defaultComparisonValue("defaultComparisonValue")
                .build()

        val roundtrippedPublicComparativeDatePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicComparativeDatePropertyOperation),
                jacksonTypeRef<PublicComparativeDatePropertyOperation>(),
            )

        assertThat(roundtrippedPublicComparativeDatePropertyOperation)
            .isEqualTo(publicComparativeDatePropertyOperation)
    }
}
