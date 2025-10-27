// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRollingPropertyUpdatedOperationTest {

    @Test
    fun create() {
        val publicRollingPropertyUpdatedOperation =
            PublicRollingPropertyUpdatedOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .numberOfDays(0)
                .operationType(
                    PublicRollingPropertyUpdatedOperation.OperationType.ROLLING_PROPERTY_UPDATED
                )
                .operator("operator")
                .build()

        assertThat(publicRollingPropertyUpdatedOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(publicRollingPropertyUpdatedOperation.numberOfDays()).isEqualTo(0)
        assertThat(publicRollingPropertyUpdatedOperation.operationType())
            .isEqualTo(PublicRollingPropertyUpdatedOperation.OperationType.ROLLING_PROPERTY_UPDATED)
        assertThat(publicRollingPropertyUpdatedOperation.operator()).isEqualTo("operator")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRollingPropertyUpdatedOperation =
            PublicRollingPropertyUpdatedOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .numberOfDays(0)
                .operationType(
                    PublicRollingPropertyUpdatedOperation.OperationType.ROLLING_PROPERTY_UPDATED
                )
                .operator("operator")
                .build()

        val roundtrippedPublicRollingPropertyUpdatedOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRollingPropertyUpdatedOperation),
                jacksonTypeRef<PublicRollingPropertyUpdatedOperation>(),
            )

        assertThat(roundtrippedPublicRollingPropertyUpdatedOperation)
            .isEqualTo(publicRollingPropertyUpdatedOperation)
    }
}
