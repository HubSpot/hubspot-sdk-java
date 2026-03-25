// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionExecutionIndexIdentifierTest {

    @Test
    fun create() {
        val actionExecutionIndexIdentifier =
            ActionExecutionIndexIdentifier.builder().actionExecutionIndex(0).enrollmentId(0).build()

        assertThat(actionExecutionIndexIdentifier.actionExecutionIndex()).isEqualTo(0)
        assertThat(actionExecutionIndexIdentifier.enrollmentId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionExecutionIndexIdentifier =
            ActionExecutionIndexIdentifier.builder().actionExecutionIndex(0).enrollmentId(0).build()

        val roundtrippedActionExecutionIndexIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionExecutionIndexIdentifier),
                jacksonTypeRef<ActionExecutionIndexIdentifier>(),
            )

        assertThat(roundtrippedActionExecutionIndexIdentifier)
            .isEqualTo(actionExecutionIndexIdentifier)
    }
}
