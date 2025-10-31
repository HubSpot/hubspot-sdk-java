// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComboEventRuleTest {

    @Test
    fun create() {
        val comboEventRule =
            ComboEventRule.builder()
                .count(0)
                .eventTypeId("eventTypeId")
                .addPropertyFilter(
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
                )
                .lookbackWindowDays(0)
                .build()

        assertThat(comboEventRule.count()).isEqualTo(0)
        assertThat(comboEventRule.eventTypeId()).isEqualTo("eventTypeId")
        assertThat(comboEventRule.propertyFilters())
            .containsExactly(
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
            )
        assertThat(comboEventRule.lookbackWindowDays()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comboEventRule =
            ComboEventRule.builder()
                .count(0)
                .eventTypeId("eventTypeId")
                .addPropertyFilter(
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
                )
                .lookbackWindowDays(0)
                .build()

        val roundtrippedComboEventRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comboEventRule),
                jacksonTypeRef<ComboEventRule>(),
            )

        assertThat(roundtrippedComboEventRule).isEqualTo(comboEventRule)
    }
}
