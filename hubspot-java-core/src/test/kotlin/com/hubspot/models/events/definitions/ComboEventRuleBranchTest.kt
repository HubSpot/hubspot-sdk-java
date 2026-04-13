// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComboEventRuleBranchTest {

    @Test
    fun create() {
        val comboEventRuleBranch =
            ComboEventRuleBranch.builder()
                .addComposingRule(
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
                                        .operator(
                                            BoolPropertyOperation.Operator.HAS_EVER_BEEN_EQUAL_TO
                                        )
                                        .operatorName("operatorName")
                                        .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                                        .value(true)
                                        .defaultValue("defaultValue")
                                        .renderSpec("renderSpec")
                                        .build()
                                )
                                .property("property")
                                .context(
                                    PropertyFilterContext.builder()
                                        .objectTypeId("objectTypeId")
                                        .build()
                                )
                                .filterInsightsId(0)
                                .frameworkFilterId(0L)
                                .build()
                        )
                        .lookbackWindowDays(0)
                        .build()
                )
                .operationType(ComboEventRuleBranch.OperationType.AND)
                .ruleBranches(listOf())
                .build()

        assertThat(comboEventRuleBranch.composingRules())
            .containsExactly(
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
                                    .operator(BoolPropertyOperation.Operator.HAS_EVER_BEEN_EQUAL_TO)
                                    .operatorName("operatorName")
                                    .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                                    .value(true)
                                    .defaultValue("defaultValue")
                                    .renderSpec("renderSpec")
                                    .build()
                            )
                            .property("property")
                            .context(
                                PropertyFilterContext.builder().objectTypeId("objectTypeId").build()
                            )
                            .filterInsightsId(0)
                            .frameworkFilterId(0L)
                            .build()
                    )
                    .lookbackWindowDays(0)
                    .build()
            )
        assertThat(comboEventRuleBranch.operationType())
            .isEqualTo(ComboEventRuleBranch.OperationType.AND)
        assertThat(comboEventRuleBranch.ruleBranches()).containsExactly()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comboEventRuleBranch =
            ComboEventRuleBranch.builder()
                .addComposingRule(
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
                                        .operator(
                                            BoolPropertyOperation.Operator.HAS_EVER_BEEN_EQUAL_TO
                                        )
                                        .operatorName("operatorName")
                                        .propertyType(BoolPropertyOperation.PropertyType.BOOL)
                                        .value(true)
                                        .defaultValue("defaultValue")
                                        .renderSpec("renderSpec")
                                        .build()
                                )
                                .property("property")
                                .context(
                                    PropertyFilterContext.builder()
                                        .objectTypeId("objectTypeId")
                                        .build()
                                )
                                .filterInsightsId(0)
                                .frameworkFilterId(0L)
                                .build()
                        )
                        .lookbackWindowDays(0)
                        .build()
                )
                .operationType(ComboEventRuleBranch.OperationType.AND)
                .ruleBranches(listOf())
                .build()

        val roundtrippedComboEventRuleBranch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(comboEventRuleBranch),
                jacksonTypeRef<ComboEventRuleBranch>(),
            )

        assertThat(roundtrippedComboEventRuleBranch).isEqualTo(comboEventRuleBranch)
    }
}
