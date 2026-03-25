// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.datastudio

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.datastudio.datasource.DataSourceGetResponse
import com.hubspot_sdk.api.models.datastudio.datasource.DataSourceUpdateResponse
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceCreateParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceDeleteParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceGetParams
import com.hubspot_sdk.api.models.datastudio.datasource.DatasourceUpdateParams
import com.hubspot_sdk.api.models.datastudio.datasource.FormDataMultiPart
import java.util.function.Consumer

interface DatasourceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasourceService

    @MustBeClosed
    fun create(params: DatasourceCreateParams): HttpResponse = create(params, RequestOptions.none())

    /** @see create */
    @MustBeClosed
    fun create(
        params: DatasourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see create */
    @MustBeClosed
    fun create(
        formDataMultiPart: FormDataMultiPart,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        create(
            DatasourceCreateParams.builder().formDataMultiPart(formDataMultiPart).build(),
            requestOptions,
        )

    /** @see create */
    @MustBeClosed
    fun create(formDataMultiPart: FormDataMultiPart): HttpResponse =
        create(formDataMultiPart, RequestOptions.none())

    fun update(datasourceId: Long, params: DatasourceUpdateParams): DataSourceUpdateResponse =
        update(datasourceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        datasourceId: Long,
        params: DatasourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSourceUpdateResponse =
        update(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

    /** @see update */
    fun update(params: DatasourceUpdateParams): DataSourceUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DatasourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSourceUpdateResponse

    @MustBeClosed
    fun delete(datasourceId: Long): HttpResponse =
        delete(datasourceId, DatasourceDeleteParams.none())

    /** @see delete */
    @MustBeClosed
    fun delete(
        datasourceId: Long,
        params: DatasourceDeleteParams = DatasourceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = delete(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

    /** @see delete */
    @MustBeClosed
    fun delete(
        datasourceId: Long,
        params: DatasourceDeleteParams = DatasourceDeleteParams.none(),
    ): HttpResponse = delete(datasourceId, params, RequestOptions.none())

    /** @see delete */
    @MustBeClosed
    fun delete(
        params: DatasourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see delete */
    @MustBeClosed
    fun delete(params: DatasourceDeleteParams): HttpResponse = delete(params, RequestOptions.none())

    /** @see delete */
    @MustBeClosed
    fun delete(datasourceId: Long, requestOptions: RequestOptions): HttpResponse =
        delete(datasourceId, DatasourceDeleteParams.none(), requestOptions)

    fun get(datasourceId: Long): DataSourceGetResponse =
        get(datasourceId, DatasourceGetParams.none())

    /** @see get */
    fun get(
        datasourceId: Long,
        params: DatasourceGetParams = DatasourceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSourceGetResponse =
        get(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

    /** @see get */
    fun get(
        datasourceId: Long,
        params: DatasourceGetParams = DatasourceGetParams.none(),
    ): DataSourceGetResponse = get(datasourceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DatasourceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSourceGetResponse

    /** @see get */
    fun get(params: DatasourceGetParams): DataSourceGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(datasourceId: Long, requestOptions: RequestOptions): DataSourceGetResponse =
        get(datasourceId, DatasourceGetParams.none(), requestOptions)

    /** A view of [DatasourceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasourceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /data-studio/2026-03/data-source`, but is otherwise
         * the same as [DatasourceService.create].
         */
        @MustBeClosed
        fun create(params: DatasourceCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DatasourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            formDataMultiPart: FormDataMultiPart,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(
                DatasourceCreateParams.builder().formDataMultiPart(formDataMultiPart).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(formDataMultiPart: FormDataMultiPart): HttpResponse =
            create(formDataMultiPart, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /data-studio/2026-03/data-source/{datasourceId}`,
         * but is otherwise the same as [DatasourceService.update].
         */
        @MustBeClosed
        fun update(
            datasourceId: Long,
            params: DatasourceUpdateParams,
        ): HttpResponseFor<DataSourceUpdateResponse> =
            update(datasourceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            datasourceId: Long,
            params: DatasourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSourceUpdateResponse> =
            update(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DatasourceUpdateParams): HttpResponseFor<DataSourceUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DatasourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSourceUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /data-studio/2026-03/data-source/{datasourceId}`,
         * but is otherwise the same as [DatasourceService.delete].
         */
        @MustBeClosed
        fun delete(datasourceId: Long): HttpResponse =
            delete(datasourceId, DatasourceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            datasourceId: Long,
            params: DatasourceDeleteParams = DatasourceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            datasourceId: Long,
            params: DatasourceDeleteParams = DatasourceDeleteParams.none(),
        ): HttpResponse = delete(datasourceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DatasourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DatasourceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(datasourceId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(datasourceId, DatasourceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /data-studio/2026-03/data-source/{datasourceId}`,
         * but is otherwise the same as [DatasourceService.get].
         */
        @MustBeClosed
        fun get(datasourceId: Long): HttpResponseFor<DataSourceGetResponse> =
            get(datasourceId, DatasourceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            datasourceId: Long,
            params: DatasourceGetParams = DatasourceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSourceGetResponse> =
            get(params.toBuilder().datasourceId(datasourceId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            datasourceId: Long,
            params: DatasourceGetParams = DatasourceGetParams.none(),
        ): HttpResponseFor<DataSourceGetResponse> = get(datasourceId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DatasourceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSourceGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: DatasourceGetParams): HttpResponseFor<DataSourceGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            datasourceId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataSourceGetResponse> =
            get(datasourceId, DatasourceGetParams.none(), requestOptions)
    }
}
