// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.limits.AssociationRecordLimitResponse
import com.hubspot_sdk.api.models.crm.limits.CalculatedPropertyLimitResponse
import com.hubspot_sdk.api.models.crm.limits.CollectionResponseAssociationLabelLimitResponseNoPaging
import com.hubspot_sdk.api.models.crm.limits.CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging
import com.hubspot_sdk.api.models.crm.limits.CustomObjectLimitResponse
import com.hubspot_sdk.api.models.crm.limits.CustomPropertyLimitResponse
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationLabelLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsByObjectTypeParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsFromObjectsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsToObjectsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetCalculatedPropertyLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetCustomObjectTypeLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetCustomPropertyLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetPipelineLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetRecordLimitsParams
import com.hubspot_sdk.api.models.crm.limits.PipelineLimitResponse
import com.hubspot_sdk.api.models.crm.limits.RecordLimitResponse
import java.util.function.Consumer

interface LimitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitService

    /** Returns limits and usage for custom association labels */
    fun getAssociationLabelLimits(): CollectionResponseAssociationLabelLimitResponseNoPaging =
        getAssociationLabelLimits(LimitGetAssociationLabelLimitsParams.none())

    /** @see getAssociationLabelLimits */
    fun getAssociationLabelLimits(
        params: LimitGetAssociationLabelLimitsParams = LimitGetAssociationLabelLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseAssociationLabelLimitResponseNoPaging

    /** @see getAssociationLabelLimits */
    fun getAssociationLabelLimits(
        params: LimitGetAssociationLabelLimitsParams = LimitGetAssociationLabelLimitsParams.none()
    ): CollectionResponseAssociationLabelLimitResponseNoPaging =
        getAssociationLabelLimits(params, RequestOptions.none())

    /** @see getAssociationLabelLimits */
    fun getAssociationLabelLimits(
        requestOptions: RequestOptions
    ): CollectionResponseAssociationLabelLimitResponseNoPaging =
        getAssociationLabelLimits(LimitGetAssociationLabelLimitsParams.none(), requestOptions)

    /** Returns records approaching or at association limits between two objects */
    fun getAssociationRecordsLimitsByObjectType(
        toObjectTypeId: String,
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
    ): AssociationRecordLimitResponse =
        getAssociationRecordsLimitsByObjectType(toObjectTypeId, params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsByObjectType */
    fun getAssociationRecordsLimitsByObjectType(
        toObjectTypeId: String,
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationRecordLimitResponse =
        getAssociationRecordsLimitsByObjectType(
            params.toBuilder().toObjectTypeId(toObjectTypeId).build(),
            requestOptions,
        )

    /** @see getAssociationRecordsLimitsByObjectType */
    fun getAssociationRecordsLimitsByObjectType(
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams
    ): AssociationRecordLimitResponse =
        getAssociationRecordsLimitsByObjectType(params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsByObjectType */
    fun getAssociationRecordsLimitsByObjectType(
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationRecordLimitResponse

    /** Returns objects with records approaching or at association limits */
    fun getAssociationRecordsLimitsFromObjects():
        CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
        getAssociationRecordsLimitsFromObjects(
            LimitGetAssociationRecordsLimitsFromObjectsParams.none()
        )

    /** @see getAssociationRecordsLimitsFromObjects */
    fun getAssociationRecordsLimitsFromObjects(
        params: LimitGetAssociationRecordsLimitsFromObjectsParams =
            LimitGetAssociationRecordsLimitsFromObjectsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging

    /** @see getAssociationRecordsLimitsFromObjects */
    fun getAssociationRecordsLimitsFromObjects(
        params: LimitGetAssociationRecordsLimitsFromObjectsParams =
            LimitGetAssociationRecordsLimitsFromObjectsParams.none()
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
        getAssociationRecordsLimitsFromObjects(params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsFromObjects */
    fun getAssociationRecordsLimitsFromObjects(
        requestOptions: RequestOptions
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
        getAssociationRecordsLimitsFromObjects(
            LimitGetAssociationRecordsLimitsFromObjectsParams.none(),
            requestOptions,
        )

    /**
     * Returns objects for which the from object has records approaching or at association limits
     */
    fun getAssociationRecordsLimitsToObjects(
        fromObjectTypeId: String
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
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
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
        getAssociationRecordsLimitsToObjects(
            params.toBuilder().fromObjectTypeId(fromObjectTypeId).build(),
            requestOptions,
        )

    /** @see getAssociationRecordsLimitsToObjects */
    fun getAssociationRecordsLimitsToObjects(
        fromObjectTypeId: String,
        params: LimitGetAssociationRecordsLimitsToObjectsParams =
            LimitGetAssociationRecordsLimitsToObjectsParams.none(),
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
        getAssociationRecordsLimitsToObjects(fromObjectTypeId, params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsToObjects */
    fun getAssociationRecordsLimitsToObjects(
        params: LimitGetAssociationRecordsLimitsToObjectsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging

    /** @see getAssociationRecordsLimitsToObjects */
    fun getAssociationRecordsLimitsToObjects(
        params: LimitGetAssociationRecordsLimitsToObjectsParams
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
        getAssociationRecordsLimitsToObjects(params, RequestOptions.none())

    /** @see getAssociationRecordsLimitsToObjects */
    fun getAssociationRecordsLimitsToObjects(
        fromObjectTypeId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
        getAssociationRecordsLimitsToObjects(
            fromObjectTypeId,
            LimitGetAssociationRecordsLimitsToObjectsParams.none(),
            requestOptions,
        )

    /** Returns overall limit and per object usage for calculated properties */
    fun getCalculatedPropertyLimits(): CalculatedPropertyLimitResponse =
        getCalculatedPropertyLimits(LimitGetCalculatedPropertyLimitsParams.none())

    /** @see getCalculatedPropertyLimits */
    fun getCalculatedPropertyLimits(
        params: LimitGetCalculatedPropertyLimitsParams =
            LimitGetCalculatedPropertyLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalculatedPropertyLimitResponse

    /** @see getCalculatedPropertyLimits */
    fun getCalculatedPropertyLimits(
        params: LimitGetCalculatedPropertyLimitsParams =
            LimitGetCalculatedPropertyLimitsParams.none()
    ): CalculatedPropertyLimitResponse = getCalculatedPropertyLimits(params, RequestOptions.none())

    /** @see getCalculatedPropertyLimits */
    fun getCalculatedPropertyLimits(
        requestOptions: RequestOptions
    ): CalculatedPropertyLimitResponse =
        getCalculatedPropertyLimits(LimitGetCalculatedPropertyLimitsParams.none(), requestOptions)

    /** Returns limits and usage for custom object schemas */
    fun getCustomObjectTypeLimits(): CustomObjectLimitResponse =
        getCustomObjectTypeLimits(LimitGetCustomObjectTypeLimitsParams.none())

    /** @see getCustomObjectTypeLimits */
    fun getCustomObjectTypeLimits(
        params: LimitGetCustomObjectTypeLimitsParams = LimitGetCustomObjectTypeLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomObjectLimitResponse

    /** @see getCustomObjectTypeLimits */
    fun getCustomObjectTypeLimits(
        params: LimitGetCustomObjectTypeLimitsParams = LimitGetCustomObjectTypeLimitsParams.none()
    ): CustomObjectLimitResponse = getCustomObjectTypeLimits(params, RequestOptions.none())

    /** @see getCustomObjectTypeLimits */
    fun getCustomObjectTypeLimits(requestOptions: RequestOptions): CustomObjectLimitResponse =
        getCustomObjectTypeLimits(LimitGetCustomObjectTypeLimitsParams.none(), requestOptions)

    /** Returns limits and usage per object for custom properties */
    fun getCustomPropertyLimits(): CustomPropertyLimitResponse =
        getCustomPropertyLimits(LimitGetCustomPropertyLimitsParams.none())

    /** @see getCustomPropertyLimits */
    fun getCustomPropertyLimits(
        params: LimitGetCustomPropertyLimitsParams = LimitGetCustomPropertyLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomPropertyLimitResponse

    /** @see getCustomPropertyLimits */
    fun getCustomPropertyLimits(
        params: LimitGetCustomPropertyLimitsParams = LimitGetCustomPropertyLimitsParams.none()
    ): CustomPropertyLimitResponse = getCustomPropertyLimits(params, RequestOptions.none())

    /** @see getCustomPropertyLimits */
    fun getCustomPropertyLimits(requestOptions: RequestOptions): CustomPropertyLimitResponse =
        getCustomPropertyLimits(LimitGetCustomPropertyLimitsParams.none(), requestOptions)

    /** Returns limits and usage per object for pipelines */
    fun getPipelineLimits(): PipelineLimitResponse =
        getPipelineLimits(LimitGetPipelineLimitsParams.none())

    /** @see getPipelineLimits */
    fun getPipelineLimits(
        params: LimitGetPipelineLimitsParams = LimitGetPipelineLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineLimitResponse

    /** @see getPipelineLimits */
    fun getPipelineLimits(
        params: LimitGetPipelineLimitsParams = LimitGetPipelineLimitsParams.none()
    ): PipelineLimitResponse = getPipelineLimits(params, RequestOptions.none())

    /** @see getPipelineLimits */
    fun getPipelineLimits(requestOptions: RequestOptions): PipelineLimitResponse =
        getPipelineLimits(LimitGetPipelineLimitsParams.none(), requestOptions)

    /** Returns limits and usage per object for records */
    fun getRecordLimits(): RecordLimitResponse = getRecordLimits(LimitGetRecordLimitsParams.none())

    /** @see getRecordLimits */
    fun getRecordLimits(
        params: LimitGetRecordLimitsParams = LimitGetRecordLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordLimitResponse

    /** @see getRecordLimits */
    fun getRecordLimits(
        params: LimitGetRecordLimitsParams = LimitGetRecordLimitsParams.none()
    ): RecordLimitResponse = getRecordLimits(params, RequestOptions.none())

    /** @see getRecordLimits */
    fun getRecordLimits(requestOptions: RequestOptions): RecordLimitResponse =
        getRecordLimits(LimitGetRecordLimitsParams.none(), requestOptions)

    /** A view of [LimitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/associations/labels`, but is
         * otherwise the same as [LimitService.getAssociationLabelLimits].
         */
        @MustBeClosed
        fun getAssociationLabelLimits():
            HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging> =
            getAssociationLabelLimits(LimitGetAssociationLabelLimitsParams.none())

        /** @see getAssociationLabelLimits */
        @MustBeClosed
        fun getAssociationLabelLimits(
            params: LimitGetAssociationLabelLimitsParams =
                LimitGetAssociationLabelLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging>

        /** @see getAssociationLabelLimits */
        @MustBeClosed
        fun getAssociationLabelLimits(
            params: LimitGetAssociationLabelLimitsParams =
                LimitGetAssociationLabelLimitsParams.none()
        ): HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging> =
            getAssociationLabelLimits(params, RequestOptions.none())

        /** @see getAssociationLabelLimits */
        @MustBeClosed
        fun getAssociationLabelLimits(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging> =
            getAssociationLabelLimits(LimitGetAssociationLabelLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/limits/2026-03/associations/records/{fromObjectTypeId}/{toObjectTypeId}`, but is
         * otherwise the same as [LimitService.getAssociationRecordsLimitsByObjectType].
         */
        @MustBeClosed
        fun getAssociationRecordsLimitsByObjectType(
            toObjectTypeId: String,
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
        ): HttpResponseFor<AssociationRecordLimitResponse> =
            getAssociationRecordsLimitsByObjectType(toObjectTypeId, params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsByObjectType */
        @MustBeClosed
        fun getAssociationRecordsLimitsByObjectType(
            toObjectTypeId: String,
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationRecordLimitResponse> =
            getAssociationRecordsLimitsByObjectType(
                params.toBuilder().toObjectTypeId(toObjectTypeId).build(),
                requestOptions,
            )

        /** @see getAssociationRecordsLimitsByObjectType */
        @MustBeClosed
        fun getAssociationRecordsLimitsByObjectType(
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams
        ): HttpResponseFor<AssociationRecordLimitResponse> =
            getAssociationRecordsLimitsByObjectType(params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsByObjectType */
        @MustBeClosed
        fun getAssociationRecordsLimitsByObjectType(
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationRecordLimitResponse>

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/associations/records/from`, but
         * is otherwise the same as [LimitService.getAssociationRecordsLimitsFromObjects].
         */
        @MustBeClosed
        fun getAssociationRecordsLimitsFromObjects():
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            getAssociationRecordsLimitsFromObjects(
                LimitGetAssociationRecordsLimitsFromObjectsParams.none()
            )

        /** @see getAssociationRecordsLimitsFromObjects */
        @MustBeClosed
        fun getAssociationRecordsLimitsFromObjects(
            params: LimitGetAssociationRecordsLimitsFromObjectsParams =
                LimitGetAssociationRecordsLimitsFromObjectsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>

        /** @see getAssociationRecordsLimitsFromObjects */
        @MustBeClosed
        fun getAssociationRecordsLimitsFromObjects(
            params: LimitGetAssociationRecordsLimitsFromObjectsParams =
                LimitGetAssociationRecordsLimitsFromObjectsParams.none()
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            getAssociationRecordsLimitsFromObjects(params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsFromObjects */
        @MustBeClosed
        fun getAssociationRecordsLimitsFromObjects(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            getAssociationRecordsLimitsFromObjects(
                LimitGetAssociationRecordsLimitsFromObjectsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /crm/limits/2026-03/associations/records/{fromObjectTypeId}/to`, but is otherwise the
         * same as [LimitService.getAssociationRecordsLimitsToObjects].
         */
        @MustBeClosed
        fun getAssociationRecordsLimitsToObjects(
            fromObjectTypeId: String
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            getAssociationRecordsLimitsToObjects(
                fromObjectTypeId,
                LimitGetAssociationRecordsLimitsToObjectsParams.none(),
            )

        /** @see getAssociationRecordsLimitsToObjects */
        @MustBeClosed
        fun getAssociationRecordsLimitsToObjects(
            fromObjectTypeId: String,
            params: LimitGetAssociationRecordsLimitsToObjectsParams =
                LimitGetAssociationRecordsLimitsToObjectsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            getAssociationRecordsLimitsToObjects(
                params.toBuilder().fromObjectTypeId(fromObjectTypeId).build(),
                requestOptions,
            )

        /** @see getAssociationRecordsLimitsToObjects */
        @MustBeClosed
        fun getAssociationRecordsLimitsToObjects(
            fromObjectTypeId: String,
            params: LimitGetAssociationRecordsLimitsToObjectsParams =
                LimitGetAssociationRecordsLimitsToObjectsParams.none(),
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            getAssociationRecordsLimitsToObjects(fromObjectTypeId, params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsToObjects */
        @MustBeClosed
        fun getAssociationRecordsLimitsToObjects(
            params: LimitGetAssociationRecordsLimitsToObjectsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>

        /** @see getAssociationRecordsLimitsToObjects */
        @MustBeClosed
        fun getAssociationRecordsLimitsToObjects(
            params: LimitGetAssociationRecordsLimitsToObjectsParams
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            getAssociationRecordsLimitsToObjects(params, RequestOptions.none())

        /** @see getAssociationRecordsLimitsToObjects */
        @MustBeClosed
        fun getAssociationRecordsLimitsToObjects(
            fromObjectTypeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            getAssociationRecordsLimitsToObjects(
                fromObjectTypeId,
                LimitGetAssociationRecordsLimitsToObjectsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/calculated-properties`, but is
         * otherwise the same as [LimitService.getCalculatedPropertyLimits].
         */
        @MustBeClosed
        fun getCalculatedPropertyLimits(): HttpResponseFor<CalculatedPropertyLimitResponse> =
            getCalculatedPropertyLimits(LimitGetCalculatedPropertyLimitsParams.none())

        /** @see getCalculatedPropertyLimits */
        @MustBeClosed
        fun getCalculatedPropertyLimits(
            params: LimitGetCalculatedPropertyLimitsParams =
                LimitGetCalculatedPropertyLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalculatedPropertyLimitResponse>

        /** @see getCalculatedPropertyLimits */
        @MustBeClosed
        fun getCalculatedPropertyLimits(
            params: LimitGetCalculatedPropertyLimitsParams =
                LimitGetCalculatedPropertyLimitsParams.none()
        ): HttpResponseFor<CalculatedPropertyLimitResponse> =
            getCalculatedPropertyLimits(params, RequestOptions.none())

        /** @see getCalculatedPropertyLimits */
        @MustBeClosed
        fun getCalculatedPropertyLimits(
            requestOptions: RequestOptions
        ): HttpResponseFor<CalculatedPropertyLimitResponse> =
            getCalculatedPropertyLimits(
                LimitGetCalculatedPropertyLimitsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/custom-object-types`, but is
         * otherwise the same as [LimitService.getCustomObjectTypeLimits].
         */
        @MustBeClosed
        fun getCustomObjectTypeLimits(): HttpResponseFor<CustomObjectLimitResponse> =
            getCustomObjectTypeLimits(LimitGetCustomObjectTypeLimitsParams.none())

        /** @see getCustomObjectTypeLimits */
        @MustBeClosed
        fun getCustomObjectTypeLimits(
            params: LimitGetCustomObjectTypeLimitsParams =
                LimitGetCustomObjectTypeLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomObjectLimitResponse>

        /** @see getCustomObjectTypeLimits */
        @MustBeClosed
        fun getCustomObjectTypeLimits(
            params: LimitGetCustomObjectTypeLimitsParams =
                LimitGetCustomObjectTypeLimitsParams.none()
        ): HttpResponseFor<CustomObjectLimitResponse> =
            getCustomObjectTypeLimits(params, RequestOptions.none())

        /** @see getCustomObjectTypeLimits */
        @MustBeClosed
        fun getCustomObjectTypeLimits(
            requestOptions: RequestOptions
        ): HttpResponseFor<CustomObjectLimitResponse> =
            getCustomObjectTypeLimits(LimitGetCustomObjectTypeLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/custom-properties`, but is
         * otherwise the same as [LimitService.getCustomPropertyLimits].
         */
        @MustBeClosed
        fun getCustomPropertyLimits(): HttpResponseFor<CustomPropertyLimitResponse> =
            getCustomPropertyLimits(LimitGetCustomPropertyLimitsParams.none())

        /** @see getCustomPropertyLimits */
        @MustBeClosed
        fun getCustomPropertyLimits(
            params: LimitGetCustomPropertyLimitsParams = LimitGetCustomPropertyLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomPropertyLimitResponse>

        /** @see getCustomPropertyLimits */
        @MustBeClosed
        fun getCustomPropertyLimits(
            params: LimitGetCustomPropertyLimitsParams = LimitGetCustomPropertyLimitsParams.none()
        ): HttpResponseFor<CustomPropertyLimitResponse> =
            getCustomPropertyLimits(params, RequestOptions.none())

        /** @see getCustomPropertyLimits */
        @MustBeClosed
        fun getCustomPropertyLimits(
            requestOptions: RequestOptions
        ): HttpResponseFor<CustomPropertyLimitResponse> =
            getCustomPropertyLimits(LimitGetCustomPropertyLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/pipelines`, but is otherwise the
         * same as [LimitService.getPipelineLimits].
         */
        @MustBeClosed
        fun getPipelineLimits(): HttpResponseFor<PipelineLimitResponse> =
            getPipelineLimits(LimitGetPipelineLimitsParams.none())

        /** @see getPipelineLimits */
        @MustBeClosed
        fun getPipelineLimits(
            params: LimitGetPipelineLimitsParams = LimitGetPipelineLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineLimitResponse>

        /** @see getPipelineLimits */
        @MustBeClosed
        fun getPipelineLimits(
            params: LimitGetPipelineLimitsParams = LimitGetPipelineLimitsParams.none()
        ): HttpResponseFor<PipelineLimitResponse> = getPipelineLimits(params, RequestOptions.none())

        /** @see getPipelineLimits */
        @MustBeClosed
        fun getPipelineLimits(
            requestOptions: RequestOptions
        ): HttpResponseFor<PipelineLimitResponse> =
            getPipelineLimits(LimitGetPipelineLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/limits/2026-03/records`, but is otherwise the
         * same as [LimitService.getRecordLimits].
         */
        @MustBeClosed
        fun getRecordLimits(): HttpResponseFor<RecordLimitResponse> =
            getRecordLimits(LimitGetRecordLimitsParams.none())

        /** @see getRecordLimits */
        @MustBeClosed
        fun getRecordLimits(
            params: LimitGetRecordLimitsParams = LimitGetRecordLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordLimitResponse>

        /** @see getRecordLimits */
        @MustBeClosed
        fun getRecordLimits(
            params: LimitGetRecordLimitsParams = LimitGetRecordLimitsParams.none()
        ): HttpResponseFor<RecordLimitResponse> = getRecordLimits(params, RequestOptions.none())

        /** @see getRecordLimits */
        @MustBeClosed
        fun getRecordLimits(requestOptions: RequestOptions): HttpResponseFor<RecordLimitResponse> =
            getRecordLimits(LimitGetRecordLimitsParams.none(), requestOptions)
    }
}
