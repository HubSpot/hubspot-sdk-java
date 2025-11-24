// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.projects

import com.hubspot_sdk.api.models.crm.PublicMergeInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectMergeParamsTest {

    @Test
    fun create() {
        ProjectMergeParams.builder()
            .publicMergeInput(
                PublicMergeInput.builder()
                    .objectIdToMerge("objectIdToMerge")
                    .primaryObjectId("primaryObjectId")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ProjectMergeParams.builder()
                .publicMergeInput(
                    PublicMergeInput.builder()
                        .objectIdToMerge("objectIdToMerge")
                        .primaryObjectId("primaryObjectId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicMergeInput.builder()
                    .objectIdToMerge("objectIdToMerge")
                    .primaryObjectId("primaryObjectId")
                    .build()
            )
    }
}
