// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.pipelines

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageInput
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStagePatchInput
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageGetParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageListParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.stages.StageUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageService = client.crm().pipelines().stages()

        val pipelineStage =
            stageService.create(
                StageCreateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .pipelineStageInput(
                        PipelineStageInput.builder()
                            .displayOrder(1)
                            .label("Done")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        pipelineStage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageService = client.crm().pipelines().stages()

        val pipelineStage =
            stageService.update(
                StageUpdateParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStagePatchInput(
                        PipelineStagePatchInput.builder()
                            .archived(true)
                            .displayOrder(1)
                            .label("Done")
                            .metadata(
                                PipelineStagePatchInput.Metadata.builder()
                                    .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        pipelineStage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageService = client.crm().pipelines().stages()

        val collectionResponsePipelineStageNoPaging =
            stageService.list(
                StageListParams.builder().objectType("objectType").pipelineId("pipelineId").build()
            )

        collectionResponsePipelineStageNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageService = client.crm().pipelines().stages()

        stageService.delete(
            StageDeleteParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageService = client.crm().pipelines().stages()

        val pipelineStage =
            stageService.get(
                StageGetParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        pipelineStage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAudit() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageService = client.crm().pipelines().stages()

        val collectionResponsePublicAuditInfoNoPaging =
            stageService.getAudit(
                StageGetAuditParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .build()
            )

        collectionResponsePublicAuditInfoNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replace() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val stageService = client.crm().pipelines().stages()

        val pipelineStage =
            stageService.replace(
                StageReplaceParams.builder()
                    .objectType("objectType")
                    .pipelineId("pipelineId")
                    .stageId("stageId")
                    .pipelineStageInput(
                        PipelineStageInput.builder()
                            .displayOrder(1)
                            .label("Done")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        pipelineStage.validate()
    }
}
