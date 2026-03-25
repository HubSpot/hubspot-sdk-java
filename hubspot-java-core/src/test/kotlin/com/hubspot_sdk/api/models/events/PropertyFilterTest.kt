// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events

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
                        .operator(BoolPropertyOperation.Operator.HAS_EVER_BEEN_EQUAL_TO)
                        .operatorName("operatorName")
                        .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                        .value(true)
                        .defaultValue("defaultValue")
                        .renderSpec("renderSpec")
                        .build()
                )
                .property("property")
                .context(PropertyFilterContext.builder().objectTypeId("objectTypeId").build())
                .filterInsightsId(0)
                .frameworkFilterId(0L)
                .build()

        assertThat(propertyFilter.filterType()).isEqualTo(PropertyFilter.FilterType.PROPERTY)
        assertThat(propertyFilter.operation())
            .isEqualTo(
                PropertyFilter.Operation.ofBoolProperty(
                    BoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType("operationType")
                        .operator(BoolPropertyOperation.Operator.HAS_EVER_BEEN_EQUAL_TO)
                        .operatorName("operatorName")
                        .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                        .value(true)
                        .defaultValue("defaultValue")
                        .renderSpec("renderSpec")
                        .build()
                )
            )
        assertThat(propertyFilter.property()).isEqualTo("property")
        assertThat(propertyFilter.context())
            .contains(PropertyFilterContext.builder().objectTypeId("objectTypeId").build())
        assertThat(propertyFilter.filterInsightsId()).contains(0)
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
                        .operator(BoolPropertyOperation.Operator.HAS_EVER_BEEN_EQUAL_TO)
                        .operatorName("operatorName")
                        .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                        .value(true)
                        .defaultValue("defaultValue")
                        .renderSpec("renderSpec")
                        .build()
                )
                .property("property")
                .context(PropertyFilterContext.builder().objectTypeId("objectTypeId").build())
                .filterInsightsId(0)
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
