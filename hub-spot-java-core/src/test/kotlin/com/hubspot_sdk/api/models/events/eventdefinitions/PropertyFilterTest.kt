// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyFilterTest {

    @Test
    fun create() {
        val propertyFilter =
            PropertyFilter.builder()
                .filterType(PropertyFilter.FilterType.PROPERTY)
                .operation(
                    BoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType("operationType")
                        .operator(BoolPropertyOperation.Operator.IS_EQUAL_TO)
                        .operatorName("operatorName")
                        .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                        .value(true)
                        .defaultValue("defaultValue")
                        .build()
                )
                .property("property")
                .frameworkFilterId(0L)
                .build()

        assertThat(propertyFilter.filterType()).isEqualTo(PropertyFilter.FilterType.PROPERTY)
        assertThat(propertyFilter.operation())
            .isEqualTo(
                PropertyFilter.Operation.ofBoolProperty(
                    BoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType("operationType")
                        .operator(BoolPropertyOperation.Operator.IS_EQUAL_TO)
                        .operatorName("operatorName")
                        .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                        .value(true)
                        .defaultValue("defaultValue")
                        .build()
                )
            )
        assertThat(propertyFilter.property()).isEqualTo("property")
        assertThat(propertyFilter.frameworkFilterId()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyFilter =
            PropertyFilter.builder()
                .filterType(PropertyFilter.FilterType.PROPERTY)
                .operation(
                    BoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType("operationType")
                        .operator(BoolPropertyOperation.Operator.IS_EQUAL_TO)
                        .operatorName("operatorName")
                        .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                        .value(true)
                        .defaultValue("defaultValue")
                        .build()
                )
                .property("property")
                .frameworkFilterId(0L)
                .build()

        val roundtrippedPropertyFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyFilter),
                jacksonTypeRef<PropertyFilter>(),
            )

        assertThat(roundtrippedPropertyFilter).isEqualTo(propertyFilter)
    }
}
