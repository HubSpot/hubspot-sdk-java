// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPropertyFilterTest {

    @Test
    fun create() {
        val publicPropertyFilter =
            PublicPropertyFilter.builder()
                .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                .operation(
                    PublicBoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                        .operator("operator")
                        .value(true)
                        .build()
                )
                .property("property")
                .build()

        assertThat(publicPropertyFilter.filterType())
            .isEqualTo(PublicPropertyFilter.FilterType.PROPERTY)
        assertThat(publicPropertyFilter.operation())
            .isEqualTo(
                PublicPropertyFilter.Operation.ofBool(
                    PublicBoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                        .operator("operator")
                        .value(true)
                        .build()
                )
            )
        assertThat(publicPropertyFilter.property()).isEqualTo("property")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPropertyFilter =
            PublicPropertyFilter.builder()
                .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                .operation(
                    PublicBoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                        .operator("operator")
                        .value(true)
                        .build()
                )
                .property("property")
                .build()

        val roundtrippedPublicPropertyFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPropertyFilter),
                jacksonTypeRef<PublicPropertyFilter>(),
            )

        assertThat(roundtrippedPublicPropertyFilter).isEqualTo(publicPropertyFilter)
    }
}
