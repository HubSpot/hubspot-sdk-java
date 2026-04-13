// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.companies

import com.hubspot.models.crm.objects.PublicMergeInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyMergeParamsTest {

    @Test
    fun create() {
        CompanyMergeParams.builder()
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
            CompanyMergeParams.builder()
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
