// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelinePatchInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PipelineServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val pipelineService = client.crm().pipelines()

        val pipeline =
            pipelineService.create(
                PipelineCreateParams.builder()
                    .objectType("objectType")
                    .pipelineInput(
                        PipelineInput.builder()
                            .displayOrder(0)
                            .label("My replaced pipeline")
                            .addStage(
                                PipelineStageInput.builder()
                                    .displayOrder(0)
                                    .label("In Progress")
                                    .metadata(
                                        PipelineStageInput.Metadata.builder()
                                            .putAdditionalProperty(
                                                "ticketState",
                                                JsonValue.from("OPEN"),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .addStage(
                                PipelineStageInput.builder()
                                    .displayOrder(1)
                                    .label("Done")
                                    .metadata(
                                        PipelineStageInput.Metadata.builder()
                                            .putAdditionalProperty(
                                                "ticketState",
                                                JsonValue.from("CLOSED"),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        pipeline.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val pipelineService = client.crm().pipelines()

        val pipeline =
            pipelineService.update(
                PipelineUpdateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .validateDealStageUsagesBeforeDelete(true)
                    .validateReferencesBeforeDelete(true)
                    .pipelinePatchInput(
                        PipelinePatchInput.builder()
                            .archived(true)
                            .displayOrder(0)
                            .label("My updated pipeline")
                            .build()
                    )
                    .build()
            )

        pipeline.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val pipelineService = client.crm().pipelines()

        val collectionResponsePipelineNoPaging = pipelineService.list("objectType")

        collectionResponsePipelineNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val pipelineService = client.crm().pipelines()

        pipelineService.delete(
            PipelineDeleteParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .validateDealStageUsagesBeforeDelete(true)
                .validateReferencesBeforeDelete(true)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val pipelineService = client.crm().pipelines()

        val pipeline =
            pipelineService.get(
                PipelineGetParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        pipeline.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAudit() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val pipelineService = client.crm().pipelines()

        val collectionResponsePublicAuditInfoNoPaging =
            pipelineService.getAudit(
                PipelineGetAuditParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .build()
            )

        collectionResponsePublicAuditInfoNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replace() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val pipelineService = client.crm().pipelines()

        val pipeline =
            pipelineService.replace(
                PipelineReplaceParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .validateDealStageUsagesBeforeDelete(true)
                    .validateReferencesBeforeDelete(true)
                    .pipelineInput(
                        PipelineInput.builder()
                            .displayOrder(0)
                            .label("My replaced pipeline")
                            .addStage(
                                PipelineStageInput.builder()
                                    .displayOrder(0)
                                    .label("In Progress")
                                    .metadata(
                                        PipelineStageInput.Metadata.builder()
                                            .putAdditionalProperty(
                                                "ticketState",
                                                JsonValue.from("OPEN"),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .addStage(
                                PipelineStageInput.builder()
                                    .displayOrder(1)
                                    .label("Done")
                                    .metadata(
                                        PipelineStageInput.Metadata.builder()
                                            .putAdditionalProperty(
                                                "ticketState",
                                                JsonValue.from("CLOSED"),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        pipeline.validate()
    }
}
