// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicActionFunctionIdentifierTest {

    @Test
    fun create() {
        val publicActionFunctionIdentifier =
            PublicActionFunctionIdentifier.builder()
                .functionType(PublicActionFunctionIdentifier.FunctionType.POST_ACTION_EXECUTION)
                .id("id")
                .build()

        assertThat(publicActionFunctionIdentifier.functionType())
            .isEqualTo(PublicActionFunctionIdentifier.FunctionType.POST_ACTION_EXECUTION)
        assertThat(publicActionFunctionIdentifier.id()).contains("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicActionFunctionIdentifier =
            PublicActionFunctionIdentifier.builder()
                .functionType(PublicActionFunctionIdentifier.FunctionType.POST_ACTION_EXECUTION)
                .id("id")
                .build()

        val roundtrippedPublicActionFunctionIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActionFunctionIdentifier),
                jacksonTypeRef<PublicActionFunctionIdentifier>(),
            )

        assertThat(roundtrippedPublicActionFunctionIdentifier)
            .isEqualTo(publicActionFunctionIdentifier)
    }
}
