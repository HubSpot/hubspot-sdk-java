// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAllPropertyTypesOperationTest {

    @Test
    fun create() {
        val publicAllPropertyTypesOperation =
            PublicAllPropertyTypesOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicAllPropertyTypesOperation.OperationType.ALL_PROPERTY)
                .operator("operator")
                .build()

        assertThat(publicAllPropertyTypesOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(publicAllPropertyTypesOperation.operationType())
            .isEqualTo(PublicAllPropertyTypesOperation.OperationType.ALL_PROPERTY)
        assertThat(publicAllPropertyTypesOperation.operator()).isEqualTo("operator")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAllPropertyTypesOperation =
            PublicAllPropertyTypesOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicAllPropertyTypesOperation.OperationType.ALL_PROPERTY)
                .operator("operator")
                .build()

        val roundtrippedPublicAllPropertyTypesOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAllPropertyTypesOperation),
                jacksonTypeRef<PublicAllPropertyTypesOperation>(),
            )

        assertThat(roundtrippedPublicAllPropertyTypesOperation)
            .isEqualTo(publicAllPropertyTypesOperation)
    }
}
