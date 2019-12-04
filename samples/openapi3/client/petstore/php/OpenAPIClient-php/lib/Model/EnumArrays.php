<?php
/**
 * EnumArrays
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.2.3-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * EnumArrays Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class EnumArrays implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'EnumArrays';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'just_symbol' => 'string',
        'array_enum' => 'string[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'just_symbol' => null,
        'array_enum' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'just_symbol' => 'just_symbol',
        'array_enum' => 'array_enum'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'just_symbol' => 'setJustSymbol',
        'array_enum' => 'setArrayEnum'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'just_symbol' => 'getJustSymbol',
        'array_enum' => 'getArrayEnum'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    const JUST_SYMBOL_GREATER_THAN_OR_EQUAL_TO = '>=';
    const JUST_SYMBOL_DOLLAR = '$';
    const ARRAY_ENUM_FISH = 'fish';
    const ARRAY_ENUM_CRAB = 'crab';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getJustSymbolAllowableValues()
    {
        return [
            self::JUST_SYMBOL_GREATER_THAN_OR_EQUAL_TO,
            self::JUST_SYMBOL_DOLLAR,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getArrayEnumAllowableValues()
    {
        return [
            self::ARRAY_ENUM_FISH,
            self::ARRAY_ENUM_CRAB,
        ];
    }
    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['just_symbol'] = isset($data['just_symbol']) ? $data['just_symbol'] : null;
        $this->container['array_enum'] = isset($data['array_enum']) ? $data['array_enum'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getJustSymbolAllowableValues();
        if (!is_null($this->container['just_symbol']) && !in_array($this->container['just_symbol'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'just_symbol', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets just_symbol
     *
     * @return string|null
     */
    public function getJustSymbol()
    {
        return $this->container['just_symbol'];
    }

    /**
     * Sets just_symbol
     *
     * @param string|null $just_symbol just_symbol
     *
     * @return $this
     */
    public function setJustSymbol($just_symbol)
    {
        $allowedValues = $this->getJustSymbolAllowableValues();
        if (!is_null($just_symbol) && !in_array($just_symbol, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'just_symbol', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['just_symbol'] = $just_symbol;

        return $this;
    }

    /**
     * Gets array_enum
     *
     * @return string[]|null
     */
    public function getArrayEnum()
    {
        return $this->container['array_enum'];
    }

    /**
     * Sets array_enum
     *
     * @param string[]|null $array_enum array_enum
     *
     * @return $this
     */
    public function setArrayEnum($array_enum)
    {
        $allowedValues = $this->getArrayEnumAllowableValues();
        if (!is_null($array_enum) && array_diff($array_enum, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'array_enum', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['array_enum'] = $array_enum;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


