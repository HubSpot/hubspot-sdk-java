// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions.revisions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RevisionGetParamsTest {

    @Test
    fun create() {
        RevisionGetParams.builder()
            .appId(0)
            .definitionId("definitionId")
            .revisionId("revisionId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RevisionGetParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .revisionId("revisionId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("definitionId")
        assertThat(params._pathParam(2)).isEqualTo("revisionId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
