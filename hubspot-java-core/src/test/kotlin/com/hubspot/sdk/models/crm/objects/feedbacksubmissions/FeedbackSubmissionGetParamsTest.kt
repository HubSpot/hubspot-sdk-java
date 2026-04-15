// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.feedbacksubmissions

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackSubmissionGetParamsTest {

    @Test
    fun create() {
        FeedbackSubmissionGetParams.builder()
            .feedbackSubmissionId("feedbackSubmissionId")
            .archived(true)
            .addAssociation("string")
            .idProperty("idProperty")
            .addProperty("string")
            .addPropertiesWithHistory("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FeedbackSubmissionGetParams.builder()
                .feedbackSubmissionId("feedbackSubmissionId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("feedbackSubmissionId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FeedbackSubmissionGetParams.builder()
                .feedbackSubmissionId("feedbackSubmissionId")
                .archived(true)
                .addAssociation("string")
                .idProperty("idProperty")
                .addProperty("string")
                .addPropertiesWithHistory("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("associations", listOf("string").joinToString(","))
                    .put("idProperty", "idProperty")
                    .put("properties", listOf("string").joinToString(","))
                    .put("propertiesWithHistory", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FeedbackSubmissionGetParams.builder()
                .feedbackSubmissionId("feedbackSubmissionId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
