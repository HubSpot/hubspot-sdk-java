// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SequenceGetParamsTest {

    @Test
    fun create() {
        SequenceGetParams.builder().sequenceId("sequenceId").build()
    }

    @Test
    fun pathParams() {
        val params = SequenceGetParams.builder().sequenceId("sequenceId").build()

        assertThat(params._pathParam(0)).isEqualTo("sequenceId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
