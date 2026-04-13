// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.pipelines.CollectionResponsePipelineNoPaging
import com.hubspot.models.crm.pipelines.CollectionResponsePipelineStageNoPaging
import com.hubspot.models.crm.pipelines.CollectionResponsePublicAuditInfoNoPaging
import com.hubspot.models.crm.pipelines.Pipeline
import com.hubspot.models.crm.pipelines.PipelineCreateParams
import com.hubspot.models.crm.pipelines.PipelineCreateStageParams
import com.hubspot.models.crm.pipelines.PipelineDeleteParams
import com.hubspot.models.crm.pipelines.PipelineDeleteStageParams
import com.hubspot.models.crm.pipelines.PipelineGetParams
import com.hubspot.models.crm.pipelines.PipelineGetStageParams
import com.hubspot.models.crm.pipelines.PipelineListAuditParams
import com.hubspot.models.crm.pipelines.PipelineListParams
import com.hubspot.models.crm.pipelines.PipelineListStageAuditParams
import com.hubspot.models.crm.pipelines.PipelineListStagesParams
import com.hubspot.models.crm.pipelines.PipelineStage
import com.hubspot.models.crm.pipelines.PipelineUpdateAllPropertiesParams
import com.hubspot.models.crm.pipelines.PipelineUpdateParams
import com.hubspot.models.crm.pipelines.PipelineUpdateStageAllPropertiesParams
import com.hubspot.models.crm.pipelines.PipelineUpdateStageParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PipelineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineServiceAsync

    /**
     * Create a new pipeline with the provided property values. The entire pipeline object,
     * including its unique ID, will be returned in the response.
     */
    fun create(objectType: String, params: PipelineCreateParams): CompletableFuture<Pipeline> =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: PipelineCreateParams): CompletableFuture<Pipeline> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /**
     * Perform a partial update of the pipeline identified by `{pipelineId}`. The updated pipeline
     * will be returned in the response.
     */
    fun update(pipelineId: String, params: PipelineUpdateParams): CompletableFuture<Pipeline> =
        update(pipelineId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pipelineId: String,
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see update */
    fun update(params: PipelineUpdateParams): CompletableFuture<Pipeline> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** Return all pipelines for the object type specified by `{objectType}`. */
    fun list(objectType: String): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(objectType, PipelineListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: PipelineListParams = PipelineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: PipelineListParams = PipelineListParams.none(),
    ): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineNoPaging>

    /** @see list */
    fun list(params: PipelineListParams): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePipelineNoPaging> =
        list(objectType, PipelineListParams.none(), requestOptions)

    /** Delete a pipeline */
    fun delete(pipelineId: String, params: PipelineDeleteParams): CompletableFuture<Void?> =
        delete(pipelineId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        pipelineId: String,
        params: PipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PipelineDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Create a pipeline stage */
    fun createStage(
        pipelineId: String,
        params: PipelineCreateStageParams,
    ): CompletableFuture<PipelineStage> = createStage(pipelineId, params, RequestOptions.none())

    /** @see createStage */
    fun createStage(
        pipelineId: String,
        params: PipelineCreateStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        createStage(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see createStage */
    fun createStage(params: PipelineCreateStageParams): CompletableFuture<PipelineStage> =
        createStage(params, RequestOptions.none())

    /** @see createStage */
    fun createStage(
        params: PipelineCreateStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /** Delete a pipeline stage */
    fun deleteStage(stageId: String, params: PipelineDeleteStageParams): CompletableFuture<Void?> =
        deleteStage(stageId, params, RequestOptions.none())

    /** @see deleteStage */
    fun deleteStage(
        stageId: String,
        params: PipelineDeleteStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteStage(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see deleteStage */
    fun deleteStage(params: PipelineDeleteStageParams): CompletableFuture<Void?> =
        deleteStage(params, RequestOptions.none())

    /** @see deleteStage */
    fun deleteStage(
        params: PipelineDeleteStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Return a single pipeline object identified by its unique `{pipelineId}`. */
    fun get(pipelineId: String, params: PipelineGetParams): CompletableFuture<Pipeline> =
        get(pipelineId, params, RequestOptions.none())

    /** @see get */
    fun get(
        pipelineId: String,
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see get */
    fun get(params: PipelineGetParams): CompletableFuture<Pipeline> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** Return a pipeline stage by ID */
    fun getStage(
        stageId: String,
        params: PipelineGetStageParams,
    ): CompletableFuture<PipelineStage> = getStage(stageId, params, RequestOptions.none())

    /** @see getStage */
    fun getStage(
        stageId: String,
        params: PipelineGetStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        getStage(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see getStage */
    fun getStage(params: PipelineGetStageParams): CompletableFuture<PipelineStage> =
        getStage(params, RequestOptions.none())

    /** @see getStage */
    fun getStage(
        params: PipelineGetStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline
     * identified by `{pipelineId}`.
     */
    fun listAudit(
        pipelineId: String,
        params: PipelineListAuditParams,
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        listAudit(pipelineId, params, RequestOptions.none())

    /** @see listAudit */
    fun listAudit(
        pipelineId: String,
        params: PipelineListAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        listAudit(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see listAudit */
    fun listAudit(
        params: PipelineListAuditParams
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        listAudit(params, RequestOptions.none())

    /** @see listAudit */
    fun listAudit(
        params: PipelineListAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging>

    /**
     * Return a reverse chronological list of all mutations that have occurred on the pipeline stage
     * identified by `{stageId}`.
     */
    fun listStageAudit(
        stageId: String,
        params: PipelineListStageAuditParams,
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        listStageAudit(stageId, params, RequestOptions.none())

    /** @see listStageAudit */
    fun listStageAudit(
        stageId: String,
        params: PipelineListStageAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        listStageAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see listStageAudit */
    fun listStageAudit(
        params: PipelineListStageAuditParams
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        listStageAudit(params, RequestOptions.none())

    /** @see listStageAudit */
    fun listStageAudit(
        params: PipelineListStageAuditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging>

    /** Return all the stages associated with the pipeline identified by `{pipelineId}`. */
    fun listStages(
        pipelineId: String,
        params: PipelineListStagesParams,
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        listStages(pipelineId, params, RequestOptions.none())

    /** @see listStages */
    fun listStages(
        pipelineId: String,
        params: PipelineListStagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        listStages(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see listStages */
    fun listStages(
        params: PipelineListStagesParams
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        listStages(params, RequestOptions.none())

    /** @see listStages */
    fun listStages(
        params: PipelineListStagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging>

    /** Replace a pipeline */
    fun updateAllProperties(
        pipelineId: String,
        params: PipelineUpdateAllPropertiesParams,
    ): CompletableFuture<Pipeline> = updateAllProperties(pipelineId, params, RequestOptions.none())

    /** @see updateAllProperties */
    fun updateAllProperties(
        pipelineId: String,
        params: PipelineUpdateAllPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        updateAllProperties(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see updateAllProperties */
    fun updateAllProperties(
        params: PipelineUpdateAllPropertiesParams
    ): CompletableFuture<Pipeline> = updateAllProperties(params, RequestOptions.none())

    /** @see updateAllProperties */
    fun updateAllProperties(
        params: PipelineUpdateAllPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    fun updateStage(
        stageId: String,
        params: PipelineUpdateStageParams,
    ): CompletableFuture<PipelineStage> = updateStage(stageId, params, RequestOptions.none())

    /** @see updateStage */
    fun updateStage(
        stageId: String,
        params: PipelineUpdateStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        updateStage(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see updateStage */
    fun updateStage(params: PipelineUpdateStageParams): CompletableFuture<PipelineStage> =
        updateStage(params, RequestOptions.none())

    /** @see updateStage */
    fun updateStage(
        params: PipelineUpdateStageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /**
     * Replace all the properties of an existing pipeline stage with the values provided. The
     * updated stage will be returned in the response.
     */
    fun updateStageAllProperties(
        stageId: String,
        params: PipelineUpdateStageAllPropertiesParams,
    ): CompletableFuture<PipelineStage> =
        updateStageAllProperties(stageId, params, RequestOptions.none())

    /** @see updateStageAllProperties */
    fun updateStageAllProperties(
        stageId: String,
        params: PipelineUpdateStageAllPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage> =
        updateStageAllProperties(params.toBuilder().stageId(stageId).build(), requestOptions)

    /** @see updateStageAllProperties */
    fun updateStageAllProperties(
        params: PipelineUpdateStageAllPropertiesParams
    ): CompletableFuture<PipelineStage> = updateStageAllProperties(params, RequestOptions.none())

    /** @see updateStageAllProperties */
    fun updateStageAllProperties(
        params: PipelineUpdateStageAllPropertiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineStage>

    /**
     * A view of [PipelineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PipelineServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/pipelines/2026-03/{objectType}`, but is
         * otherwise the same as [PipelineServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: PipelineCreateParams,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(params: PipelineCreateParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /**
         * Returns a raw HTTP response for `patch /crm/pipelines/2026-03/{objectType}/{pipelineId}`,
         * but is otherwise the same as [PipelineServiceAsync.update].
         */
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(pipelineId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pipelineId: String,
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see update */
        fun update(params: PipelineUpdateParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /**
         * Returns a raw HTTP response for `get /crm/pipelines/2026-03/{objectType}`, but is
         * otherwise the same as [PipelineServiceAsync.list].
         */
        fun list(
            objectType: String
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(objectType, PipelineListParams.none())

        /** @see list */
        fun list(
            objectType: String,
            params: PipelineListParams = PipelineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        fun list(
            objectType: String,
            params: PipelineListParams = PipelineListParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>>

        /** @see list */
        fun list(
            params: PipelineListParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> =
            list(objectType, PipelineListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}`, but is otherwise the same as
         * [PipelineServiceAsync.delete].
         */
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(pipelineId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            pipelineId: String,
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see delete */
        fun delete(params: PipelineDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [PipelineServiceAsync.createStage].
         */
        fun createStage(
            pipelineId: String,
            params: PipelineCreateStageParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            createStage(pipelineId, params, RequestOptions.none())

        /** @see createStage */
        fun createStage(
            pipelineId: String,
            params: PipelineCreateStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            createStage(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see createStage */
        fun createStage(
            params: PipelineCreateStageParams
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            createStage(params, RequestOptions.none())

        /** @see createStage */
        fun createStage(
            params: PipelineCreateStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineServiceAsync.deleteStage].
         */
        fun deleteStage(
            stageId: String,
            params: PipelineDeleteStageParams,
        ): CompletableFuture<HttpResponse> = deleteStage(stageId, params, RequestOptions.none())

        /** @see deleteStage */
        fun deleteStage(
            stageId: String,
            params: PipelineDeleteStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteStage(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see deleteStage */
        fun deleteStage(params: PipelineDeleteStageParams): CompletableFuture<HttpResponse> =
            deleteStage(params, RequestOptions.none())

        /** @see deleteStage */
        fun deleteStage(
            params: PipelineDeleteStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /crm/pipelines/2026-03/{objectType}/{pipelineId}`,
         * but is otherwise the same as [PipelineServiceAsync.get].
         */
        fun get(
            pipelineId: String,
            params: PipelineGetParams,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(pipelineId, params, RequestOptions.none())

        /** @see get */
        fun get(
            pipelineId: String,
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see get */
        fun get(params: PipelineGetParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineServiceAsync.getStage].
         */
        fun getStage(
            stageId: String,
            params: PipelineGetStageParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            getStage(stageId, params, RequestOptions.none())

        /** @see getStage */
        fun getStage(
            stageId: String,
            params: PipelineGetStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            getStage(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see getStage */
        fun getStage(
            params: PipelineGetStageParams
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            getStage(params, RequestOptions.none())

        /** @see getStage */
        fun getStage(
            params: PipelineGetStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/audit`, but is otherwise the same as
         * [PipelineServiceAsync.listAudit].
         */
        fun listAudit(
            pipelineId: String,
            params: PipelineListAuditParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            listAudit(pipelineId, params, RequestOptions.none())

        /** @see listAudit */
        fun listAudit(
            pipelineId: String,
            params: PipelineListAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            listAudit(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see listAudit */
        fun listAudit(
            params: PipelineListAuditParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            listAudit(params, RequestOptions.none())

        /** @see listAudit */
        fun listAudit(
            params: PipelineListAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}/audit`, but is
         * otherwise the same as [PipelineServiceAsync.listStageAudit].
         */
        fun listStageAudit(
            stageId: String,
            params: PipelineListStageAuditParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            listStageAudit(stageId, params, RequestOptions.none())

        /** @see listStageAudit */
        fun listStageAudit(
            stageId: String,
            params: PipelineListStageAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            listStageAudit(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see listStageAudit */
        fun listStageAudit(
            params: PipelineListStageAuditParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> =
            listStageAudit(params, RequestOptions.none())

        /** @see listStageAudit */
        fun listStageAudit(
            params: PipelineListStageAuditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages`, but is otherwise the same as
         * [PipelineServiceAsync.listStages].
         */
        fun listStages(
            pipelineId: String,
            params: PipelineListStagesParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> =
            listStages(pipelineId, params, RequestOptions.none())

        /** @see listStages */
        fun listStages(
            pipelineId: String,
            params: PipelineListStagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> =
            listStages(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see listStages */
        fun listStages(
            params: PipelineListStagesParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> =
            listStages(params, RequestOptions.none())

        /** @see listStages */
        fun listStages(
            params: PipelineListStagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>>

        /**
         * Returns a raw HTTP response for `put /crm/pipelines/2026-03/{objectType}/{pipelineId}`,
         * but is otherwise the same as [PipelineServiceAsync.updateAllProperties].
         */
        fun updateAllProperties(
            pipelineId: String,
            params: PipelineUpdateAllPropertiesParams,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            updateAllProperties(pipelineId, params, RequestOptions.none())

        /** @see updateAllProperties */
        fun updateAllProperties(
            pipelineId: String,
            params: PipelineUpdateAllPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            updateAllProperties(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see updateAllProperties */
        fun updateAllProperties(
            params: PipelineUpdateAllPropertiesParams
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            updateAllProperties(params, RequestOptions.none())

        /** @see updateAllProperties */
        fun updateAllProperties(
            params: PipelineUpdateAllPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineServiceAsync.updateStage].
         */
        fun updateStage(
            stageId: String,
            params: PipelineUpdateStageParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            updateStage(stageId, params, RequestOptions.none())

        /** @see updateStage */
        fun updateStage(
            stageId: String,
            params: PipelineUpdateStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            updateStage(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see updateStage */
        fun updateStage(
            params: PipelineUpdateStageParams
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            updateStage(params, RequestOptions.none())

        /** @see updateStage */
        fun updateStage(
            params: PipelineUpdateStageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}`, but is otherwise the
         * same as [PipelineServiceAsync.updateStageAllProperties].
         */
        fun updateStageAllProperties(
            stageId: String,
            params: PipelineUpdateStageAllPropertiesParams,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            updateStageAllProperties(stageId, params, RequestOptions.none())

        /** @see updateStageAllProperties */
        fun updateStageAllProperties(
            stageId: String,
            params: PipelineUpdateStageAllPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            updateStageAllProperties(params.toBuilder().stageId(stageId).build(), requestOptions)

        /** @see updateStageAllProperties */
        fun updateStageAllProperties(
            params: PipelineUpdateStageAllPropertiesParams
        ): CompletableFuture<HttpResponseFor<PipelineStage>> =
            updateStageAllProperties(params, RequestOptions.none())

        /** @see updateStageAllProperties */
        fun updateStageAllProperties(
            params: PipelineUpdateStageAllPropertiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineStage>>
    }
}
