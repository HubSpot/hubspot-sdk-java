// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicComparativePropertyUpdatedOperationTest {

    @Test
    fun create() {
        val publicComparativePropertyUpdatedOperation =
            PublicComparativePropertyUpdatedOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType(
                    PublicComparativePropertyUpdatedOperation.OperationType
                        .COMPARATIVE_PROPERTY_UPDATED
                )
                .operator("operator")
                .defaultComparisonValue("defaultComparisonValue")
                .build()

        assertThat(publicComparativePropertyUpdatedOperation.comparisonPropertyName())
            .isEqualTo("comparisonPropertyName")
        assertThat(publicComparativePropertyUpdatedOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(publicComparativePropertyUpdatedOperation.operationType())
            .isEqualTo(
                PublicComparativePropertyUpdatedOperation.OperationType.COMPARATIVE_PROPERTY_UPDATED
            )
        assertThat(publicComparativePropertyUpdatedOperation.operator()).isEqualTo("operator")
        assertThat(publicComparativePropertyUpdatedOperation.defaultComparisonValue())
            .contains("defaultComparisonValue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicComparativePropertyUpdatedOperation =
            PublicComparativePropertyUpdatedOperation.builder()
                .comparisonPropertyName("comparisonPropertyName")
                .includeObjectsWithNoValueSet(true)
                .operationType(
                    PublicComparativePropertyUpdatedOperation.OperationType
                        .COMPARATIVE_PROPERTY_UPDATED
                )
                .operator("operator")
                .defaultComparisonValue("defaultComparisonValue")
                .build()

        val roundtrippedPublicComparativePropertyUpdatedOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicComparativePropertyUpdatedOperation),
                jacksonTypeRef<PublicComparativePropertyUpdatedOperation>(),
            )

        assertThat(roundtrippedPublicComparativePropertyUpdatedOperation)
            .isEqualTo(publicComparativePropertyUpdatedOperation)
    }
}
