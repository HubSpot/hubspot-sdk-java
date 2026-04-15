// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicActionFunctionTest {

    @Test
    fun create() {
        val publicActionFunction =
            PublicActionFunction.builder()
                .functionSource("functionSource")
                .functionType(PublicActionFunction.FunctionType.POST_ACTION_EXECUTION)
                .id("id")
                .build()

        assertThat(publicActionFunction.functionSource()).isEqualTo("functionSource")
        assertThat(publicActionFunction.functionType())
            .isEqualTo(PublicActionFunction.FunctionType.POST_ACTION_EXECUTION)
        assertThat(publicActionFunction.id()).contains("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicActionFunction =
            PublicActionFunction.builder()
                .functionSource("functionSource")
                .functionType(PublicActionFunction.FunctionType.POST_ACTION_EXECUTION)
                .id("id")
                .build()

        val roundtrippedPublicActionFunction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActionFunction),
                jacksonTypeRef<PublicActionFunction>(),
            )

        assertThat(roundtrippedPublicActionFunction).isEqualTo(publicActionFunction)
    }
}
