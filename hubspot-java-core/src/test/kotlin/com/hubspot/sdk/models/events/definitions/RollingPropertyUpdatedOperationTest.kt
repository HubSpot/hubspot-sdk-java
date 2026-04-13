// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RollingPropertyUpdatedOperationTest {

    @Test
    fun create() {
        val rollingPropertyUpdatedOperation =
            RollingPropertyUpdatedOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .numberOfDays(0)
                .operationType("operationType")
                .operator(RollingPropertyUpdatedOperation.Operator.NOT_UPDATED_IN_LAST_X_DAYS)
                .operatorName("operatorName")
                .propertyType(RollingPropertyUpdatedOperation.PropertyType.ROLLING_PROPERTY_UPDATED)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(rollingPropertyUpdatedOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(rollingPropertyUpdatedOperation.numberOfDays()).isEqualTo(0)
        assertThat(rollingPropertyUpdatedOperation.operationType()).isEqualTo("operationType")
        assertThat(rollingPropertyUpdatedOperation.operator())
            .isEqualTo(RollingPropertyUpdatedOperation.Operator.NOT_UPDATED_IN_LAST_X_DAYS)
        assertThat(rollingPropertyUpdatedOperation.operatorName()).isEqualTo("operatorName")
        assertThat(rollingPropertyUpdatedOperation.propertyType())
            .isEqualTo(RollingPropertyUpdatedOperation.PropertyType.ROLLING_PROPERTY_UPDATED)
        assertThat(rollingPropertyUpdatedOperation.defaultValue()).contains("defaultValue")
        assertThat(rollingPropertyUpdatedOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rollingPropertyUpdatedOperation =
            RollingPropertyUpdatedOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .numberOfDays(0)
                .operationType("operationType")
                .operator(RollingPropertyUpdatedOperation.Operator.NOT_UPDATED_IN_LAST_X_DAYS)
                .operatorName("operatorName")
                .propertyType(RollingPropertyUpdatedOperation.PropertyType.ROLLING_PROPERTY_UPDATED)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedRollingPropertyUpdatedOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rollingPropertyUpdatedOperation),
                jacksonTypeRef<RollingPropertyUpdatedOperation>(),
            )

        assertThat(roundtrippedRollingPropertyUpdatedOperation)
            .isEqualTo(rollingPropertyUpdatedOperation)
    }
}
