// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.hubdb

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowDeleteDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListDraftPage
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListPage
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateDraftParams
import com.hubspot_sdk.api.services.blocking.cms.hubdb.rows.BatchService
import java.util.function.Consumer

interface RowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService

    fun batch(): BatchService

    /**
     * Add a new row to a HubDB table. New rows will be added to the draft version of the table. Use
     * the `/publish` endpoint to push these changes to published version.
     */
    fun create(tableIdOrName: String, params: RowCreateParams): HubDbTableRowV3 =
        create(tableIdOrName, params, RequestOptions.none())

    /** @see create */
    fun create(
        tableIdOrName: String,
        params: RowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 =
        create(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see create */
    fun create(params: RowCreateParams): HubDbTableRowV3 = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /**
     * Returns a set of rows in the published version of the specified table. Row results can be
     * filtered and sorted. Filtering and sorting options will be sent as query parameters to the
     * API request. For example, by adding the query parameters `column1__gt=5&sort=-column1`, API
     * returns the rows with values for column `column1` greater than 5 and in the descending order
     * of `column1` values. Refer to the
     * [overview section](https://developers.hubspot.com/docs/api/cms/hubdb#filtering-and-sorting-table-rows)
     * for detailed filtering and sorting options. **Note:** This endpoint can be accessed without
     * any authentication, if the table is set to be allowed for public access.
     */
    fun list(tableIdOrName: String): RowListPage = list(tableIdOrName, RowListParams.none())

    /** @see list */
    fun list(
        tableIdOrName: String,
        params: RowListParams = RowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowListPage = list(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see list */
    fun list(tableIdOrName: String, params: RowListParams = RowListParams.none()): RowListPage =
        list(tableIdOrName, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RowListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowListPage

    /** @see list */
    fun list(params: RowListParams): RowListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(tableIdOrName: String, requestOptions: RequestOptions): RowListPage =
        list(tableIdOrName, RowListParams.none(), requestOptions)

    /** Clones a single row in the draft version of a table. */
    fun cloneDraft(rowId: String, params: RowCloneDraftParams): HubDbTableRowV3 =
        cloneDraft(rowId, params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        rowId: String,
        params: RowCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = cloneDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see cloneDraft */
    fun cloneDraft(params: RowCloneDraftParams): HubDbTableRowV3 =
        cloneDraft(params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        params: RowCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /** Permanently deletes a row from a table's draft version. */
    fun deleteDraft(rowId: String, params: RowDeleteDraftParams) =
        deleteDraft(rowId, params, RequestOptions.none())

    /** @see deleteDraft */
    fun deleteDraft(
        rowId: String,
        params: RowDeleteDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see deleteDraft */
    fun deleteDraft(params: RowDeleteDraftParams) = deleteDraft(params, RequestOptions.none())

    /** @see deleteDraft */
    fun deleteDraft(
        params: RowDeleteDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Get a single row by ID from the published version of a table. **Note:** This endpoint can be
     * accessed without any authentication, if the table is set to be allowed for public access.
     */
    fun get(rowId: String, params: RowGetParams): HubDbTableRowV3 =
        get(rowId, params, RequestOptions.none())

    /** @see get */
    fun get(
        rowId: String,
        params: RowGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = get(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see get */
    fun get(params: RowGetParams): HubDbTableRowV3 = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RowGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /** Get a single row by ID from a table's draft version. */
    fun getDraft(rowId: String, params: RowGetDraftParams): HubDbTableRowV3 =
        getDraft(rowId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        rowId: String,
        params: RowGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = getDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(params: RowGetDraftParams): HubDbTableRowV3 =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: RowGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /**
     * Returns rows in the draft version of the specified table. Row results can be filtered and
     * sorted. Filtering and sorting options will be sent as query parameters to the API request.
     * For example, by adding the query parameters `column1__gt=5&sort=-column1`, API returns the
     * rows with values for column `column1` greater than 5 and in the descending order of `column1`
     * values. Refer to the
     * [overview section](https://developers.hubspot.com/docs/api/cms/hubdb#filtering-and-sorting-table-rows)
     * for detailed filtering and sorting options.
     */
    fun listDraft(tableIdOrName: String): RowListDraftPage =
        listDraft(tableIdOrName, RowListDraftParams.none())

    /** @see listDraft */
    fun listDraft(
        tableIdOrName: String,
        params: RowListDraftParams = RowListDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowListDraftPage =
        listDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see listDraft */
    fun listDraft(
        tableIdOrName: String,
        params: RowListDraftParams = RowListDraftParams.none(),
    ): RowListDraftPage = listDraft(tableIdOrName, params, RequestOptions.none())

    /** @see listDraft */
    fun listDraft(
        params: RowListDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowListDraftPage

    /** @see listDraft */
    fun listDraft(params: RowListDraftParams): RowListDraftPage =
        listDraft(params, RequestOptions.none())

    /** @see listDraft */
    fun listDraft(tableIdOrName: String, requestOptions: RequestOptions): RowListDraftPage =
        listDraft(tableIdOrName, RowListDraftParams.none(), requestOptions)

    /**
     * Replace a single row in the draft version of a table. All column values must be specified. If
     * a column has a value in the target table and this request doesn't define that value, it will
     * be deleted. See the "Create a row" endpoint for instructions on how to format the JSON row
     * definitions.
     */
    fun replaceDraft(rowId: String, params: RowReplaceDraftParams): HubDbTableRowV3 =
        replaceDraft(rowId, params, RequestOptions.none())

    /** @see replaceDraft */
    fun replaceDraft(
        rowId: String,
        params: RowReplaceDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = replaceDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see replaceDraft */
    fun replaceDraft(params: RowReplaceDraftParams): HubDbTableRowV3 =
        replaceDraft(params, RequestOptions.none())

    /** @see replaceDraft */
    fun replaceDraft(
        params: RowReplaceDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /**
     * Sparse updates a single row in the table's draft version. All the column values need not be
     * specified. Only the columns or fields that needs to be modified can be specified. See the
     * "Create a row" endpoint for instructions on how to format the JSON row definitions.
     */
    fun updateDraft(rowId: String, params: RowUpdateDraftParams): HubDbTableRowV3 =
        updateDraft(rowId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        rowId: String,
        params: RowUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3 = updateDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: RowUpdateDraftParams): HubDbTableRowV3 =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: RowUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableRowV3

    /** A view of [RowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/hubdb/tables/{tableIdOrName}/rows`, but is
         * otherwise the same as [RowService.create].
         */
        @MustBeClosed
        fun create(
            tableIdOrName: String,
            params: RowCreateParams,
        ): HttpResponseFor<HubDbTableRowV3> = create(tableIdOrName, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            tableIdOrName: String,
            params: RowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            create(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: RowCreateParams): HttpResponseFor<HubDbTableRowV3> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}/rows`, but is
         * otherwise the same as [RowService.list].
         */
        @MustBeClosed
        fun list(tableIdOrName: String): HttpResponseFor<RowListPage> =
            list(tableIdOrName, RowListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            tableIdOrName: String,
            params: RowListParams = RowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowListPage> =
            list(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            tableIdOrName: String,
            params: RowListParams = RowListParams.none(),
        ): HttpResponseFor<RowListPage> = list(tableIdOrName, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RowListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: RowListParams): HttpResponseFor<RowListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RowListPage> = list(tableIdOrName, RowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft/clone`, but is otherwise the same
         * as [RowService.cloneDraft].
         */
        @MustBeClosed
        fun cloneDraft(
            rowId: String,
            params: RowCloneDraftParams,
        ): HttpResponseFor<HubDbTableRowV3> = cloneDraft(rowId, params, RequestOptions.none())

        /** @see cloneDraft */
        @MustBeClosed
        fun cloneDraft(
            rowId: String,
            params: RowCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            cloneDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see cloneDraft */
        @MustBeClosed
        fun cloneDraft(params: RowCloneDraftParams): HttpResponseFor<HubDbTableRowV3> =
            cloneDraft(params, RequestOptions.none())

        /** @see cloneDraft */
        @MustBeClosed
        fun cloneDraft(
            params: RowCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `delete
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same as
         * [RowService.deleteDraft].
         */
        @MustBeClosed
        fun deleteDraft(rowId: String, params: RowDeleteDraftParams): HttpResponse =
            deleteDraft(rowId, params, RequestOptions.none())

        /** @see deleteDraft */
        @MustBeClosed
        fun deleteDraft(
            rowId: String,
            params: RowDeleteDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see deleteDraft */
        @MustBeClosed
        fun deleteDraft(params: RowDeleteDraftParams): HttpResponse =
            deleteDraft(params, RequestOptions.none())

        /** @see deleteDraft */
        @MustBeClosed
        fun deleteDraft(
            params: RowDeleteDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}`,
         * but is otherwise the same as [RowService.get].
         */
        @MustBeClosed
        fun get(rowId: String, params: RowGetParams): HttpResponseFor<HubDbTableRowV3> =
            get(rowId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            rowId: String,
            params: RowGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            get(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: RowGetParams): HttpResponseFor<HubDbTableRowV3> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: RowGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same as
         * [RowService.getDraft].
         */
        @MustBeClosed
        fun getDraft(rowId: String, params: RowGetDraftParams): HttpResponseFor<HubDbTableRowV3> =
            getDraft(rowId, params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            rowId: String,
            params: RowGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            getDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(params: RowGetDraftParams): HttpResponseFor<HubDbTableRowV3> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            params: RowGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft`,
         * but is otherwise the same as [RowService.listDraft].
         */
        @MustBeClosed
        fun listDraft(tableIdOrName: String): HttpResponseFor<RowListDraftPage> =
            listDraft(tableIdOrName, RowListDraftParams.none())

        /** @see listDraft */
        @MustBeClosed
        fun listDraft(
            tableIdOrName: String,
            params: RowListDraftParams = RowListDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowListDraftPage> =
            listDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see listDraft */
        @MustBeClosed
        fun listDraft(
            tableIdOrName: String,
            params: RowListDraftParams = RowListDraftParams.none(),
        ): HttpResponseFor<RowListDraftPage> =
            listDraft(tableIdOrName, params, RequestOptions.none())

        /** @see listDraft */
        @MustBeClosed
        fun listDraft(
            params: RowListDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowListDraftPage>

        /** @see listDraft */
        @MustBeClosed
        fun listDraft(params: RowListDraftParams): HttpResponseFor<RowListDraftPage> =
            listDraft(params, RequestOptions.none())

        /** @see listDraft */
        @MustBeClosed
        fun listDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RowListDraftPage> =
            listDraft(tableIdOrName, RowListDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same as
         * [RowService.replaceDraft].
         */
        @MustBeClosed
        fun replaceDraft(
            rowId: String,
            params: RowReplaceDraftParams,
        ): HttpResponseFor<HubDbTableRowV3> = replaceDraft(rowId, params, RequestOptions.none())

        /** @see replaceDraft */
        @MustBeClosed
        fun replaceDraft(
            rowId: String,
            params: RowReplaceDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            replaceDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see replaceDraft */
        @MustBeClosed
        fun replaceDraft(params: RowReplaceDraftParams): HttpResponseFor<HubDbTableRowV3> =
            replaceDraft(params, RequestOptions.none())

        /** @see replaceDraft */
        @MustBeClosed
        fun replaceDraft(
            params: RowReplaceDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>

        /**
         * Returns a raw HTTP response for `patch
         * /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft`, but is otherwise the same as
         * [RowService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            rowId: String,
            params: RowUpdateDraftParams,
        ): HttpResponseFor<HubDbTableRowV3> = updateDraft(rowId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            rowId: String,
            params: RowUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3> =
            updateDraft(params.toBuilder().rowId(rowId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: RowUpdateDraftParams): HttpResponseFor<HubDbTableRowV3> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: RowUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableRowV3>
    }
}
