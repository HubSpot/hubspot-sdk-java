// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts.revisions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RevisionRestorePreviousVersionParamsTest {

    @Test
    fun create() {
        RevisionRestorePreviousVersionParams.builder()
            .objectId("objectId")
            .revisionId("revisionId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RevisionRestorePreviousVersionParams.builder()
                .objectId("objectId")
                .revisionId("revisionId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        assertThat(params._pathParam(1)).isEqualTo("revisionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
