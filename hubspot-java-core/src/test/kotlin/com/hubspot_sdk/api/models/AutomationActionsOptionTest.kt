// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationActionsOptionTest {

    @Test
    fun create() {
        val automationActionsOption =
            AutomationActionsOption.builder()
                .description("description")
                .displayOrder(0)
                .doubleData(0.0)
                .hidden(true)
                .label("label")
                .readOnly(true)
                .value("value")
                .build()

        assertThat(automationActionsOption.description()).isEqualTo("description")
        assertThat(automationActionsOption.displayOrder()).isEqualTo(0)
        assertThat(automationActionsOption.doubleData()).isEqualTo(0.0)
        assertThat(automationActionsOption.hidden()).isEqualTo(true)
        assertThat(automationActionsOption.label()).isEqualTo("label")
        assertThat(automationActionsOption.readOnly()).isEqualTo(true)
        assertThat(automationActionsOption.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automationActionsOption =
            AutomationActionsOption.builder()
                .description("description")
                .displayOrder(0)
                .doubleData(0.0)
                .hidden(true)
                .label("label")
                .readOnly(true)
                .value("value")
                .build()

        val roundtrippedAutomationActionsOption =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automationActionsOption),
                jacksonTypeRef<AutomationActionsOption>(),
            )

        assertThat(roundtrippedAutomationActionsOption).isEqualTo(automationActionsOption)
    }
}
