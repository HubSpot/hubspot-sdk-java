// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDateTimePropertyOperationTest {

    @Test
    fun create() {
        val publicDateTimePropertyOperation =
            PublicDateTimePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicDateTimePropertyOperation.OperationType.DATETIME)
                .operator("operator")
                .requiresTimeZoneConversion(true)
                .timestamp(0)
                .build()

        assertThat(publicDateTimePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(publicDateTimePropertyOperation.operationType())
            .isEqualTo(PublicDateTimePropertyOperation.OperationType.DATETIME)
        assertThat(publicDateTimePropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicDateTimePropertyOperation.requiresTimeZoneConversion()).isEqualTo(true)
        assertThat(publicDateTimePropertyOperation.timestamp()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDateTimePropertyOperation =
            PublicDateTimePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicDateTimePropertyOperation.OperationType.DATETIME)
                .operator("operator")
                .requiresTimeZoneConversion(true)
                .timestamp(0)
                .build()

        val roundtrippedPublicDateTimePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDateTimePropertyOperation),
                jacksonTypeRef<PublicDateTimePropertyOperation>(),
            )

        assertThat(roundtrippedPublicDateTimePropertyOperation)
            .isEqualTo(publicDateTimePropertyOperation)
    }
}
