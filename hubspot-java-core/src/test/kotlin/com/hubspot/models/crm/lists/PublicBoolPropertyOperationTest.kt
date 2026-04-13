// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicBoolPropertyOperationTest {

    @Test
    fun create() {
        val publicBoolPropertyOperation =
            PublicBoolPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                .operator("operator")
                .value(true)
                .build()

        assertThat(publicBoolPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(publicBoolPropertyOperation.operationType())
            .isEqualTo(PublicBoolPropertyOperation.OperationType.BOOL)
        assertThat(publicBoolPropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicBoolPropertyOperation.value()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicBoolPropertyOperation =
            PublicBoolPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                .operator("operator")
                .value(true)
                .build()

        val roundtrippedPublicBoolPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicBoolPropertyOperation),
                jacksonTypeRef<PublicBoolPropertyOperation>(),
            )

        assertThat(roundtrippedPublicBoolPropertyOperation).isEqualTo(publicBoolPropertyOperation)
    }
}
