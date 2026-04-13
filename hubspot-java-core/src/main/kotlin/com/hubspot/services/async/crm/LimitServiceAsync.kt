// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.limits.AssociationRecordLimitResponse
import com.hubspot.models.crm.limits.CalculatedPropertyLimitResponse
import com.hubspot.models.crm.limits.CollectionResponseAssociationLabelLimitResponseNoPaging
import com.hubspot.models.crm.limits.CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging
import com.hubspot.models.crm.limits.CustomObjectLimitResponse
import com.hubspot.models.crm.limits.CustomPropertyLimitResponse
import com.hubspot.models.crm.limits.LimitGetAssociationLabelLimitsParams
import com.hubspot.models.crm.limits.LimitGetAssociationRecordsLimitsByObjectTypeParams
import com.hubspot.models.crm.limits.LimitGetAssociationRecordsLimitsFromObjectsParams
import com.hubspot.models.crm.limits.LimitGetAssociationRecordsLimitsToObjectsParams
import com.hubspot.models.crm.limits.LimitGetCalculatedPropertyLimitsParams
import com.hubspot.models.crm.limits.LimitGetCustomObjectTypeLimitsParams
import com.hubspot.models.crm.limits.LimitGetCustomPropertyLimitsParams
import com.hubspot.models.crm.limits.LimitGetPipelineLimitsParams
import com.hubspot.models.crm.limits.LimitGetRecordLimitsParams
import com.hubspot.models.crm.limits.PipelineLimitResponse
import com.hubspot.models.crm.limits.RecordLimitResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LimitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitServiceAsync

    /** Returns limits and usage for custom association labels */
    fun getAssociationLabelLimits():
        CompletableFuture<CollectionResponseAssociationLabelLimitResponseNoPaging> =
        getAssociationLabelLimits(LimitGetAssociationLabelLimitsParams.none())

    /** @see getAssociationLabelLimits */
    fun getAssociationLabelLimits(
        params: LimitGetAssociationLabelLimitsParams = LimitGetAssociationLabelLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseAssociationLabelLimitResponseNoPaging>

    /** @see getAssociationLabelLimits */
    fun getAssociationLabelLimits(
        params: LimitGetAssociationLabelLimitsParams = LimitGetAssociationLabelLimitsParams.none()
    ): CompletableFuture<CollectionResponseAssociationLabelLimitResponseNoPaging> =
        getAssociationLabelLimits(params, RequestOptions.none())

    /** @see getAssociationLabelLimits */
    fun getAssociationLabelLimits(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseAssociationLabelLimitResponseNoPaging> =
        getAssociationLabelLimits(LimitGetAssociationLabelLimitsParams.none(), requestOptions)

    /** Returns records approaching or at association limits between two objects */
    fun getAssociationRecordsLimitsByObjectType(
        toObjectTypeId: String,
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
    ): CompletableFuture<AssociationRecordLimitResponse> =
        getAssociationRecordsLimitsByObjectType(toObjectTypeId, params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsByObjectType */
    fun getAssociationRecordsLimitsByObjectType(
        toObjectTypeId: String,
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationRecordLimitResponse> =
        getAssociationRecordsLimitsByObjectType(
            params.toBuilder().toObjectTypeId(toObjectTypeId).build(),
            requestOptions,
        )

    /** @see getAssociationRecordsLimitsByObjectType */
    fun getAssociationRecordsLimitsByObjectType(
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams
    ): CompletableFuture<AssociationRecordLimitResponse> =
        getAssociationRecordsLimitsByObjectType(params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsByObjectType */
    fun getAssociationRecordsLimitsByObjectType(
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationRecordLimitResponse>

    /** Returns objects with records approaching or at association limits */
    fun getAssociationRecordsLimitsFromObjects():
        CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        getAssociationRecordsLimitsFromObjects(
            LimitGetAssociationRecordsLimitsFromObjectsParams.none()
        )

    /** @see getAssociationRecordsLimitsFromObjects */
    fun getAssociationRecordsLimitsFromObjects(
        params: LimitGetAssociationRecordsLimitsFromObjectsParams =
            LimitGetAssociationRecordsLimitsFromObjectsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>

    /** @see getAssociationRecordsLimitsFromObjects */
    fun getAssociationRecordsLimitsFromObjects(
        params: LimitGetAssociationRecordsLimitsFromObjectsParams =
            LimitGetAssociationRecordsLimitsFromObjectsParams.none()
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        getAssociationRecordsLimitsFromObjects(params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsFromObjects */
    fun getAssociationRecordsLimitsFromObjects(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        getAssociationRecordsLimitsFromObjects(
            LimitGetAssociationRecordsLimitsFromObjectsParams.none(),
            requestOptions,
        )

    /**
     * Returns objects for which the from object has records approaching or at association limits
     */
    fun getAssociationRecordsLimitsToObjects(
        fromObjectTypeId: String
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        getAssociationRecordsLimitsToObjects(
            fromObjectTypeId,
            LimitGetAssociationRecordsLimitsToObjectsParams.none(),
        )

    /** @see getAssociationRecordsLimitsToObjects */
    fun getAssociationRecordsLimitsToObjects(
        fromObjectTypeId: String,
        params: LimitGetAssociationRecordsLimitsToObjectsParams =
            LimitGetAssociationRecordsLimitsToObjectsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        getAssociationRecordsLimitsToObjects(
            params.toBuilder().fromObjectTypeId(fromObjectTypeId).build(),
            requestOptions,
        )

    /** @see getAssociationRecordsLimitsToObjects */
    fun getAssociationRecordsLimitsToObjects(
        fromObjectTypeId: String,
        params: LimitGetAssociationRecordsLimitsToObjectsParams =
            LimitGetAssociationRecordsLimitsToObjectsParams.none(),
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        getAssociationRecordsLimitsToObjects(fromObjectTypeId, params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsToObjects */
    fun getAssociationRecordsLimitsToObjects(
        params: LimitGetAssociationRecordsLimitsToObjectsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>

    /** @see getAssociationRecordsLimitsToObjects */
    fun getAssociationRecordsLimitsToObjects(
        params: LimitGetAssociationRecordsLimitsToObjectsParams
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        getAssociationRecordsLimitsToObjects(params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsToObjects */
    fun getAssociationRecordsLimitsToObjects(
        fromObjectTypeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        getAssociationRecordsLimitsToObjects(
            fromObjectTypeId,
            LimitGetAssociationRecordsLimitsToObjectsParams.none(),
            requestOptions,
        )

    /** Returns overall limit and per object usage for calculated properties */
    fun getCalculatedPropertyLimits(): CompletableFuture<CalculatedPropertyLimitResponse> =
        getCalculatedPropertyLimits(LimitGetCalculatedPropertyLimitsParams.none())

    /** @see getCalculatedPropertyLimits */
    fun getCalculatedPropertyLimits(
        params: LimitGetCalculatedPropertyLimitsParams =
            LimitGetCalculatedPropertyLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalculatedPropertyLimitResponse>

    /** @see getCalculatedPropertyLimits */
    fun getCalculatedPropertyLimits(
        params: LimitGetCalculatedPropertyLimitsParams =
            LimitGetCalculatedPropertyLimitsParams.none()
    ): CompletableFuture<CalculatedPropertyLimitResponse> =
        getCalculatedPropertyLimits(params, RequestOptions.none())

    /** @see getCalculatedPropertyLimits */
    fun getCalculatedPropertyLimits(
        requestOptions: RequestOptions
    ): CompletableFuture<CalculatedPropertyLimitResponse> =
        getCalculatedPropertyLimits(LimitGetCalculatedPropertyLimitsParams.none(), requestOptions)

    /** Returns limits and usage for custom object schemas */
    fun getCustomObjectTypeLimits(): CompletableFuture<CustomObjectLimitResponse> =
        getCustomObjectTypeLimits(LimitGetCustomObjectTypeLimitsParams.none())

    /** @see getCustomObjectTypeLimits */
    fun getCustomObjectTypeLimits(
        params: LimitGetCustomObjectTypeLimitsParams = LimitGetCustomObjectTypeLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomObjectLimitResponse>

    /** @see getCustomObjectTypeLimits */
    fun getCustomObjectTypeLimits(
        params: LimitGetCustomObjectTypeLimitsParams = LimitGetCustomObjectTypeLimitsParams.none()
    ): CompletableFuture<CustomObjectLimitResponse> =
        getCustomObjectTypeLimits(params, RequestOptions.none())

    /** @see getCustomObjectTypeLimits */
    fun getCustomObjectTypeLimits(
        requestOptions: RequestOptions
    ): CompletableFuture<CustomObjectLimitResponse> =
        getCustomObjectTypeLimits(LimitGetCustomObjectTypeLimitsParams.none(), requestOptions)

    /** Returns limits and usage per object for custom properties */
    fun getCustomPropertyLimits(): CompletableFuture<CustomPropertyLimitResponse> =
        getCustomPropertyLimits(LimitGetCustomPropertyLimitsParams.none())

    /** @see getCustomPropertyLimits */
    fun getCustomPropertyLimits(
        params: LimitGetCustomPropertyLimitsParams = LimitGetCustomPropertyLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomPropertyLimitResponse>

    /** @see getCustomPropertyLimits */
    fun getCustomPropertyLimits(
        params: LimitGetCustomPropertyLimitsParams = LimitGetCustomPropertyLimitsParams.none()
    ): CompletableFuture<CustomPropertyLimitResponse> =
        getCustomPropertyLimits(params, RequestOptions.none())

    /** @see getCustomPropertyLimits */
    fun getCustomPropertyLimits(
        requestOptions: RequestOptions
    ): CompletableFuture<CustomPropertyLimitResponse> =
        getCustomPropertyLimits(LimitGetCustomPropertyLimitsParams.none(), requestOptions)

    /** Returns limits and usage per object for pipelines */
    fun getPipelineLimits(): CompletableFuture<PipelineLimitResponse> =
        getPipelineLimits(LimitGetPipelineLimitsParams.none())

    /** @see getPipelineLimits */
    fun getPipelineLimits(
        params: LimitGetPipelineLimitsParams = LimitGetPipelineLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineLimitResponse>

    /** @see getPipelineLimits */
    fun getPipelineLimits(
        params: LimitGetPipelineLimitsParams = LimitGetPipelineLimitsParams.none()
    ): CompletableFuture<PipelineLimitResponse> = getPipelineLimits(params, RequestOptions.none())

    /** @see getPipelineLimits */
    fun getPipelineLimits(
        requestOptions: RequestOptions
    ): CompletableFuture<PipelineLimitResponse> =
        getPipelineLimits(LimitGetPipelineLimitsParams.none(), requestOptions)

    /** Returns limits and usage per object for records */
    fun getRecordLimits(): CompletableFuture<RecordLimitResponse> =
        getRecordLimits(LimitGetRecordLimitsParams.none())

    /** @see getRecordLimits */
    fun getRecordLimits(
        params: LimitGetRecordLimitsParams = LimitGetRecordLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordLimitResponse>

    /** @see getRecordLimits */
    fun getRecordLimits(
        params: LimitGetRecordLimitsParams = LimitGetRecordLimitsParams.none()
    ): CompletableFuture<RecordLimitResponse> = getRecordLimits(params, RequestOptions.none())

    /** @see getRecordLimits */
    fun getRecordLimits(requestOptions: RequestOptions): CompletableFuture<RecordLimitResponse> =
        getRecordLimits(LimitGetRecordLimitsParams.none(), requestOptions)

    /** A view of [LimitServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LimitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/associations/labels`, but is
         * otherwise the same as [LimitServiceAsync.getAssociationLabelLimits].
         */
        fun getAssociationLabelLimits():
            CompletableFuture<
                HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging>
            > = getAssociationLabelLimits(LimitGetAssociationLabelLimitsParams.none())

        /** @see getAssociationLabelLimits */
        fun getAssociationLabelLimits(
            params: LimitGetAssociationLabelLimitsParams =
                LimitGetAssociationLabelLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging>
        >

        /** @see getAssociationLabelLimits */
        fun getAssociationLabelLimits(
            params: LimitGetAssociationLabelLimitsParams =
                LimitGetAssociationLabelLimitsParams.none()
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging>
        > = getAssociationLabelLimits(params, RequestOptions.none())

        /** @see getAssociationLabelLimits */
        fun getAssociationLabelLimits(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging>
        > = getAssociationLabelLimits(LimitGetAssociationLabelLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/limits/2026-03/associations/records/{fromObjectTypeId}/{toObjectTypeId}`, but is
         * otherwise the same as [LimitServiceAsync.getAssociationRecordsLimitsByObjectType].
         */
        fun getAssociationRecordsLimitsByObjectType(
            toObjectTypeId: String,
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
        ): CompletableFuture<HttpResponseFor<AssociationRecordLimitResponse>> =
            getAssociationRecordsLimitsByObjectType(toObjectTypeId, params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsByObjectType */
        fun getAssociationRecordsLimitsByObjectType(
            toObjectTypeId: String,
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationRecordLimitResponse>> =
            getAssociationRecordsLimitsByObjectType(
                params.toBuilder().toObjectTypeId(toObjectTypeId).build(),
                requestOptions,
            )

        /** @see getAssociationRecordsLimitsByObjectType */
        fun getAssociationRecordsLimitsByObjectType(
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams
        ): CompletableFuture<HttpResponseFor<AssociationRecordLimitResponse>> =
            getAssociationRecordsLimitsByObjectType(params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsByObjectType */
        fun getAssociationRecordsLimitsByObjectType(
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationRecordLimitResponse>>

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/associations/records/from`, but
         * is otherwise the same as [LimitServiceAsync.getAssociationRecordsLimitsFromObjects].
         */
        fun getAssociationRecordsLimitsFromObjects():
            CompletableFuture<
                HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
            > =
            getAssociationRecordsLimitsFromObjects(
                LimitGetAssociationRecordsLimitsFromObjectsParams.none()
            )

        /** @see getAssociationRecordsLimitsFromObjects */
        fun getAssociationRecordsLimitsFromObjects(
            params: LimitGetAssociationRecordsLimitsFromObjectsParams =
                LimitGetAssociationRecordsLimitsFromObjectsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        >

        /** @see getAssociationRecordsLimitsFromObjects */
        fun getAssociationRecordsLimitsFromObjects(
            params: LimitGetAssociationRecordsLimitsFromObjectsParams =
                LimitGetAssociationRecordsLimitsFromObjectsParams.none()
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        > = getAssociationRecordsLimitsFromObjects(params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsFromObjects */
        fun getAssociationRecordsLimitsFromObjects(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        > =
            getAssociationRecordsLimitsFromObjects(
                LimitGetAssociationRecordsLimitsFromObjectsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /crm/limits/2026-03/associations/records/{fromObjectTypeId}/to`, but is otherwise the
         * same as [LimitServiceAsync.getAssociationRecordsLimitsToObjects].
         */
        fun getAssociationRecordsLimitsToObjects(
            fromObjectTypeId: String
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        > =
            getAssociationRecordsLimitsToObjects(
                fromObjectTypeId,
                LimitGetAssociationRecordsLimitsToObjectsParams.none(),
            )

        /** @see getAssociationRecordsLimitsToObjects */
        fun getAssociationRecordsLimitsToObjects(
            fromObjectTypeId: String,
            params: LimitGetAssociationRecordsLimitsToObjectsParams =
                LimitGetAssociationRecordsLimitsToObjectsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        > =
            getAssociationRecordsLimitsToObjects(
                params.toBuilder().fromObjectTypeId(fromObjectTypeId).build(),
                requestOptions,
            )

        /** @see getAssociationRecordsLimitsToObjects */
        fun getAssociationRecordsLimitsToObjects(
            fromObjectTypeId: String,
            params: LimitGetAssociationRecordsLimitsToObjectsParams =
                LimitGetAssociationRecordsLimitsToObjectsParams.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        > = getAssociationRecordsLimitsToObjects(fromObjectTypeId, params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsToObjects */
        fun getAssociationRecordsLimitsToObjects(
            params: LimitGetAssociationRecordsLimitsToObjectsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        >

        /** @see getAssociationRecordsLimitsToObjects */
        fun getAssociationRecordsLimitsToObjects(
            params: LimitGetAssociationRecordsLimitsToObjectsParams
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        > = getAssociationRecordsLimitsToObjects(params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsToObjects */
        fun getAssociationRecordsLimitsToObjects(
            fromObjectTypeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        > =
            getAssociationRecordsLimitsToObjects(
                fromObjectTypeId,
                LimitGetAssociationRecordsLimitsToObjectsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/calculated-properties`, but is
         * otherwise the same as [LimitServiceAsync.getCalculatedPropertyLimits].
         */
        fun getCalculatedPropertyLimits():
            CompletableFuture<HttpResponseFor<CalculatedPropertyLimitResponse>> =
            getCalculatedPropertyLimits(LimitGetCalculatedPropertyLimitsParams.none())

        /** @see getCalculatedPropertyLimits */
        fun getCalculatedPropertyLimits(
            params: LimitGetCalculatedPropertyLimitsParams =
                LimitGetCalculatedPropertyLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalculatedPropertyLimitResponse>>

        /** @see getCalculatedPropertyLimits */
        fun getCalculatedPropertyLimits(
            params: LimitGetCalculatedPropertyLimitsParams =
                LimitGetCalculatedPropertyLimitsParams.none()
        ): CompletableFuture<HttpResponseFor<CalculatedPropertyLimitResponse>> =
            getCalculatedPropertyLimits(params, RequestOptions.none())

        /** @see getCalculatedPropertyLimits */
        fun getCalculatedPropertyLimits(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CalculatedPropertyLimitResponse>> =
            getCalculatedPropertyLimits(
                LimitGetCalculatedPropertyLimitsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/custom-object-types`, but is
         * otherwise the same as [LimitServiceAsync.getCustomObjectTypeLimits].
         */
        fun getCustomObjectTypeLimits():
            CompletableFuture<HttpResponseFor<CustomObjectLimitResponse>> =
            getCustomObjectTypeLimits(LimitGetCustomObjectTypeLimitsParams.none())

        /** @see getCustomObjectTypeLimits */
        fun getCustomObjectTypeLimits(
            params: LimitGetCustomObjectTypeLimitsParams =
                LimitGetCustomObjectTypeLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomObjectLimitResponse>>

        /** @see getCustomObjectTypeLimits */
        fun getCustomObjectTypeLimits(
            params: LimitGetCustomObjectTypeLimitsParams =
                LimitGetCustomObjectTypeLimitsParams.none()
        ): CompletableFuture<HttpResponseFor<CustomObjectLimitResponse>> =
            getCustomObjectTypeLimits(params, RequestOptions.none())

        /** @see getCustomObjectTypeLimits */
        fun getCustomObjectTypeLimits(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomObjectLimitResponse>> =
            getCustomObjectTypeLimits(LimitGetCustomObjectTypeLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/custom-properties`, but is
         * otherwise the same as [LimitServiceAsync.getCustomPropertyLimits].
         */
        fun getCustomPropertyLimits():
            CompletableFuture<HttpResponseFor<CustomPropertyLimitResponse>> =
            getCustomPropertyLimits(LimitGetCustomPropertyLimitsParams.none())

        /** @see getCustomPropertyLimits */
        fun getCustomPropertyLimits(
            params: LimitGetCustomPropertyLimitsParams = LimitGetCustomPropertyLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomPropertyLimitResponse>>

        /** @see getCustomPropertyLimits */
        fun getCustomPropertyLimits(
            params: LimitGetCustomPropertyLimitsParams = LimitGetCustomPropertyLimitsParams.none()
        ): CompletableFuture<HttpResponseFor<CustomPropertyLimitResponse>> =
            getCustomPropertyLimits(params, RequestOptions.none())

        /** @see getCustomPropertyLimits */
        fun getCustomPropertyLimits(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomPropertyLimitResponse>> =
            getCustomPropertyLimits(LimitGetCustomPropertyLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/pipelines`, but is otherwise the
         * same as [LimitServiceAsync.getPipelineLimits].
         */
        fun getPipelineLimits(): CompletableFuture<HttpResponseFor<PipelineLimitResponse>> =
            getPipelineLimits(LimitGetPipelineLimitsParams.none())

        /** @see getPipelineLimits */
        fun getPipelineLimits(
            params: LimitGetPipelineLimitsParams = LimitGetPipelineLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineLimitResponse>>

        /** @see getPipelineLimits */
        fun getPipelineLimits(
            params: LimitGetPipelineLimitsParams = LimitGetPipelineLimitsParams.none()
        ): CompletableFuture<HttpResponseFor<PipelineLimitResponse>> =
            getPipelineLimits(params, RequestOptions.none())

        /** @see getPipelineLimits */
        fun getPipelineLimits(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PipelineLimitResponse>> =
            getPipelineLimits(LimitGetPipelineLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/records`, but is otherwise the
         * same as [LimitServiceAsync.getRecordLimits].
         */
        fun getRecordLimits(): CompletableFuture<HttpResponseFor<RecordLimitResponse>> =
            getRecordLimits(LimitGetRecordLimitsParams.none())

        /** @see getRecordLimits */
        fun getRecordLimits(
            params: LimitGetRecordLimitsParams = LimitGetRecordLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordLimitResponse>>

        /** @see getRecordLimits */
        fun getRecordLimits(
            params: LimitGetRecordLimitsParams = LimitGetRecordLimitsParams.none()
        ): CompletableFuture<HttpResponseFor<RecordLimitResponse>> =
            getRecordLimits(params, RequestOptions.none())

        /** @see getRecordLimits */
        fun getRecordLimits(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RecordLimitResponse>> =
            getRecordLimits(LimitGetRecordLimitsParams.none(), requestOptions)
    }
}
