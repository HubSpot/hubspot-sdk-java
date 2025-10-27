// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormPostSubmitActionTest {

    @Test
    fun create() {
        val formPostSubmitAction =
            FormPostSubmitAction.builder()
                .type(FormPostSubmitAction.Type.THANK_YOU)
                .value("value")
                .build()

        assertThat(formPostSubmitAction.type()).isEqualTo(FormPostSubmitAction.Type.THANK_YOU)
        assertThat(formPostSubmitAction.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formPostSubmitAction =
            FormPostSubmitAction.builder()
                .type(FormPostSubmitAction.Type.THANK_YOU)
                .value("value")
                .build()

        val roundtrippedFormPostSubmitAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formPostSubmitAction),
                jacksonTypeRef<FormPostSubmitAction>(),
            )

        assertThat(roundtrippedFormPostSubmitAction).isEqualTo(formPostSubmitAction)
    }
}
